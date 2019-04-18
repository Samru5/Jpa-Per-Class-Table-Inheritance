package com.capgemini.springjpatableperclassinheritance.controller;

import java.util.HashSet;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springjpatableperclassinheritance.dao.EmployeeDao;
import com.capgemini.springjpatableperclassinheritance.model.Employee;
import com.capgemini.springjpatableperclassinheritance.model.FullTimeEmployee;
import com.capgemini.springjpatableperclassinheritance.model.PartTimeEmployee;
import com.capgemini.springjpatableperclassinheritance.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@Autowired
	private EmployeeDao dao;

	@RequestMapping("/")
	public Set<Employee> add() {

		Set<Employee> employee = new HashSet<Employee>();
		employee.add(new PartTimeEmployee(101, "Tina", 500));
		employee.add(new FullTimeEmployee(102, "Meena", 20000));
		service.addNew(employee);
		return employee;
	}

}
