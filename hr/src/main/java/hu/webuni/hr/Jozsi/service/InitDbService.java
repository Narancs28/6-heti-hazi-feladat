package hu.webuni.hr.Jozsi.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.hr.Jozsi.model.Company;
import hu.webuni.hr.Jozsi.model.Employee;
import hu.webuni.hr.Jozsi.model.Position;
import hu.webuni.hr.Jozsi.model.PositionDetailsByCompany;
import hu.webuni.hr.Jozsi.model.Qualification;
import hu.webuni.hr.Jozsi.repository.CompanyRepository;
import hu.webuni.hr.Jozsi.repository.EmployeeRepository;
import hu.webuni.hr.Jozsi.repository.PositionDetailsByCompanyRepository;
import hu.webuni.hr.Jozsi.repository.PositionRepository;

@Service
public class InitDbService {
	
	
	@Autowired
	PositionRepository positionRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	PositionDetailsByCompanyRepository positionDetailsByCompanyRepository;
	
	@Transactional
	public void initDb() {
		
//		Position developer = positionRepository.save(new Position("fejlesztő", Qualification.UNIVERSITY));
//		Position tester = positionRepository.save(new Position("tesztelő", Qualification.HIGH_SCHOOL));
		
		Employee newEmployee1 = employeeRepository.save(new Employee(null, "ssdf", "developer", 200000, LocalDateTime.now()));
//		newEmployee1.setPosition(developer);
		
		Employee newEmployee2 = employeeRepository.save(new Employee(null, "t35", "tester", 200000, LocalDateTime.now()));
//		newEmployee2.setPosition(tester);
		Company newCompany = companyRepository.save(new Company(null, 10, "sdfsd", "" ));
		newCompany.addEmployee(newEmployee2);
		newCompany.addEmployee(newEmployee1);
		
//		PositionDetailsByCompany pd = new PositionDetailsByCompany();
//		pd.setCompany(newCompany);
//		pd.setMinSalary(250000);
//		pd.setPosition(developer);
//		positionDetailsByCompanyRepository.save(pd);
//		
//		PositionDetailsByCompany pd2 = new PositionDetailsByCompany();
//		pd2.setCompany(newCompany);
//		pd2.setMinSalary(200000);
//		pd2.setPosition(tester);
//		positionDetailsByCompanyRepository.save(pd2);
	}

}
