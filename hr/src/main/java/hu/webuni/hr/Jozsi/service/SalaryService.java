package hu.webuni.hr.Jozsi.service;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

import hu.webuni.hr.Jozsi.model.Employee;
import hu.webuni.hr.Jozsi.repository.EmployeeRepository;
import hu.webuni.hr.Jozsi.repository.PositionDetailsByCompanyRepository;
import hu.webuni.hr.Jozsi.repository.PositionRepository;

@Service
public class SalaryService {
	
	private EmployeeService employeeService;
	private PositionRepository positionRepository;
	private PositionDetailsByCompanyRepository positionDetailsByCompanyRepository;
	private EmployeeRepository employeeRepository;
	
	public SalaryService(EmployeeService employeeService, PositionRepository positionRepository,
			PositionDetailsByCompanyRepository positionDetailsByCompanyRepository,
			EmployeeRepository employeeRepository) {
		this.employeeService = employeeService;
		this.positionRepository = positionRepository;
		this.positionDetailsByCompanyRepository = positionDetailsByCompanyRepository;
		this.employeeRepository = employeeRepository;
	}
	
	

	
	
	public void setNewSalary(Employee employee) {
		int newSalary = employee.getSalary()*(100+ employeeService.getPAyRaisePercent(employee)) /100;
		employee.setSalary(newSalary);
	}
	
}
	
	

	
	
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.hr.Jozsi.Employee;

@Service
public class SalaryService {
	
	@Autowired
	EmployeeService employeeService;
	
	public Employee newSalary (Employee employee) {
		int salary;
		salary= (int) (employee.getSalary() * (employeeService.getPayRaisePercent(employee) / 100.0) + employee.getSalary());
		employee.setSalary(salary);
		return employee;
		
	}
		
	
}
	

	;
>>>>>>> branch 'master' of file:///C:\Users\Tulajdonos\git\repository
