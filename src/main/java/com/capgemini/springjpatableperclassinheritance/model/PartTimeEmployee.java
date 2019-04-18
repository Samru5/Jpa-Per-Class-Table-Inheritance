package com.capgemini.springjpatableperclassinheritance.model;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Part_TIME_EMPLOYEE")

public class PartTimeEmployee extends Employee {

	private int hourlyRate;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(long empId, String empName, int hourlyRate) {
		super(empId, empName);
		this.hourlyRate = hourlyRate;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hourlyRate=" + hourlyRate + "]";
	}
	
	

}
