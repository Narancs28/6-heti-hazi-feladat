package hu.webuni.hr.Jozsi.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.hr.Jozsi.config.HrConfigProperties;
import hu.webuni.hr.Jozsi.model.Employee;

@Service
public class DefaultEmployeeService extends AbstractEmployeeService{
	
	@Autowired
	HrConfigProperties config;

	@Override
	public int getPAyRaisePercent(Employee employee) {
	 return  config.getSalary().getDef().getPercent();
	 
	}		 
	
}
=======
import org.springframework.stereotype.Service;

import hu.webuni.hr.Jozsi.Employee;

@Service
public class DefaultEmployeeService implements EmployeeService{

	@Override
	public int getPayRaisePercent(Employee employee) {
		return 5;
	}
}	

	
>>>>>>> branch 'master' of file:///C:\Users\Tulajdonos\git\repository
