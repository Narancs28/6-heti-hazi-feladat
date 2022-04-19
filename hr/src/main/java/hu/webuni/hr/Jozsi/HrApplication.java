package hu.webuni.hr.Jozsi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.webuni.hr.Jozsi.service.EmployeeService;


@SpringBootApplication
public class HrApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    System.out.println(employeeService.getPayRaisePercent(null));
	}

}
