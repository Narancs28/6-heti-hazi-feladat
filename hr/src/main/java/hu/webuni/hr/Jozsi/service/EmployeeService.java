package hu.webuni.hr.Jozsi.service;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

import hu.webuni.hr.Jozsi.model.Employee;

public interface EmployeeService {
	
    public Employee save(Employee employee);
	
	public Employee update(Employee employee);
	
	public List<Employee> findAll();
	
	public Optional<Employee> findById(long id);
	
	public void delete(long id);
	
		
	int getPAyRaisePercent(Employee employee);
=======
import hu.webuni.hr.Jozsi.Employee;

public interface EmployeeService {
	
	public int getPayRaisePercent(Employee employee);

>>>>>>> branch 'master' of file:///C:\Users\Tulajdonos\git\repository
}
