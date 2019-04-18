package com.capgemini.springjpatableperclassinheritance.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springjpatableperclassinheritance.dao.EmployeeDao;
import com.capgemini.springjpatableperclassinheritance.model.Employee;
import com.capgemini.springjpatableperclassinheritance.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public void addNew(Set<Employee> employee) {
		dao.saveAll(employee);

	}

}
