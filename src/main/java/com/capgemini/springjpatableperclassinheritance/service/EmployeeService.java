package com.capgemini.springjpatableperclassinheritance.service;

import java.util.Set;

import com.capgemini.springjpatableperclassinheritance.model.Employee;
import com.capgemini.springjpatableperclassinheritance.model.FullTimeEmployee;
import com.capgemini.springjpatableperclassinheritance.model.PartTimeEmployee;

public interface EmployeeService {

	public void addNew(Set<Employee> employee );
	

}
