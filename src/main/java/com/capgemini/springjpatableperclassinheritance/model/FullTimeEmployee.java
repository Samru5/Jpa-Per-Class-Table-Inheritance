package com.capgemini.springjpatableperclassinheritance.model;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FULL_TIME_EMPLOYEE")
public class FullTimeEmployee extends Employee {

	private int salary;

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(long empId, String empName, int salary) {
		super(empId, empName);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + "]";
	}

}
