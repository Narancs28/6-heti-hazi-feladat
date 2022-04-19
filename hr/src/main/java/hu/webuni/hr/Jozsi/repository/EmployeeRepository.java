package hu.webuni.hr.Jozsi.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.webuni.hr.Jozsi.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
	
	List<Employee> findBySalaryGreaterThan(Integer minSalary);

	List<Employee> findByJobTitle(String jobTitle);
	List<Employee> findByNameStartingWithIgnoreCase(String name);
	List<Employee> findByDateOfStartWorkBetween(LocalDateTime start, LocalDateTime end);
	

}
