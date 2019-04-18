package com.capgemini.springjpatableperclassinheritance.model;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {
	 @Id
	 @Column(name = "id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;
	 
	private String empName;

	public Employee() {
		super();
	}

	public Employee(long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	

}
