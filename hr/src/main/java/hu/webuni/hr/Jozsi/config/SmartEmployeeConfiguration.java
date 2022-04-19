package hu.webuni.hr.Jozsi.config;

<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.Jozsi.service.EmployeeService;
import hu.webuni.hr.Jozsi.service.SmartEmployeeService;

@Configuration
@Profile("smart")
public class SmartEmployeeConfiguration {
	
	@Bean
=======
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import hu.webuni.hr.Jozsi.service.EmployeeService;
import hu.webuni.hr.Jozsi.service.SmartEmployeeService;

@Configuration
@Profile("smart")
public class SmartEmployeeConfiguration {
	
	
>>>>>>> branch 'master' of file:///C:\Users\Tulajdonos\git\repository
	public EmployeeService employeeService() {
	    return new SmartEmployeeService();
  }
	
}
