package hu.webuni.hr.Jozsi.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Long employeeId;
	
	private String name;
	private String jobTitle;
	private int salary;
	private LocalDateTime dateOfstartWork;
	
	@ManyToOne
	private Company company;
	
	
	public Employee() {	
	}
	
	public Employee(Long employeeId, String name, String jobTitle, int salary, LocalDateTime dateOfstartWork) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.dateOfstartWork = dateOfstartWork;
	}	
	
	public Employee(int salary, LocalDateTime dateOfStartWork) {
		this.salary = salary;
		this.dateOfstartWork = dateOfStartWork;	
		
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDateTime getDateOfstartWork() {
		return dateOfstartWork;
	}
	public void setDateOfstartWork(LocalDateTime dateOfstartWork) {
		this.dateOfstartWork = dateOfstartWork;
	}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
		
	}	
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (employeeId == null) {
				if (other.employeeId != null)
					return false;
			} else if (!employeeId.equals(other.employeeId))
				return false;
			return true;
		}	
			

}
