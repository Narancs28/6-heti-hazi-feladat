package hu.webuni.hr.Jozsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.webuni.hr.Jozsi.model.AverageSalaryByPosition;
import hu.webuni.hr.Jozsi.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{
	
	
public List<Company> findByEmployeeWithSalaryHigherThan(int minSalary);
	
	public List<Company> findByEmployeeCountHigherThan(int minEmployeeCount);

	public List<AverageSalaryByPosition> findAverageSalariesByPosition(long companyId);
	

}
