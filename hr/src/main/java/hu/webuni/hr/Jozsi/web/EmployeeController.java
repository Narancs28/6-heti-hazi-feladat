package hu.webuni.hr.Jozsi.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;



import hu.webuni.hr.Jozsi.dto.EmployeeDto;
import hu.webuni.hr.Jozsi.mapper.EmployeeMapper;
import hu.webuni.hr.Jozsi.model.Employee;
import hu.webuni.hr.Jozsi.repository.EmployeeRepository;
import hu.webuni.hr.Jozsi.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private  EmployeeService employeeService;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	
	
	
	@GetMapping
	private List<EmployeeDto> getAll(@RequestParam(required= false) Integer  minSalary) {
		List<Employee> employees = null;
		 if (minSalary == null) {
			 employees = employeeService.findAll();
	       } else {
		     employees = employeeRepository.findBySalaryGreaterThan(minSalary);
	       }
	     return employeeMapper.employeesToDtos(employees);
  }
	

//	@GetMapping(params = "minSalary")
//	 public List<EmployeeDto> getAllByMinSalary(@RequestParam int minSalary) {
//		 return employees.values().stream().filter(e->e.getSalary()> minSalary).collect(Collectors.toList());
//	}
	
	
@GetMapping("/{id}")
	public EmployeeDto getById(@PathVariable long id) {
	Employee employee = findByIdOrThrow(id);
	return employeeMapper.employeeToDto(employee);
}

private Employee findByIdOrThrow(long id) {
	return employeeService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
}
	   

@PostMapping
public EmployeeDto createEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
	return employeeMapper.employeeToDto(employeeService.save(employeeMapper.dtoToEmployee(employeeDto)));
}


@PutMapping("/{id}")
public ResponseEntity<EmployeeDto> modifyEmployee(@PathVariable long id, @RequestBody @Valid EmployeeDto employeeDto) {
	employeeDto.setId(id);
	Employee updatedEmployee = employeeService.update(employeeMapper.dtoToEmployee(employeeDto));
	if(updatedEmployee == null) {
		return ResponseEntity.notFound().build();
	} else {
		return ResponseEntity.ok(employeeMapper.employeeToDto(updatedEmployee));
	}
	

}

@DeleteMapping("/{id}")
public void deleteEmployee(@PathVariable long id) {
	employeeService.delete(id);
	
}

 @PostMapping("/payRaise")
  public int getPayRaisePercent(@RequestBody Employee employee) {
	 return employeeService.getPAyRaisePercent(employee);
 }
 

}






