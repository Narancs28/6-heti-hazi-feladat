package hu.webuni.hr.Jozsi.service;

import org.springframework.stereotype.Service;

import hu.webuni.hr.Jozsi.Employee;

@Service
public class DefaultEmployeeService implements EmployeeService{

	@Override
	public int getPayRaisePercent(Employee employee) {
		return 5;
	}
}	

	
