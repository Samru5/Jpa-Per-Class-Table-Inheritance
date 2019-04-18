package com.capgemini.springjpatableperclassinheritance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.springjpatableperclassinheritance.model.Employee;


public interface EmployeeDao  extends JpaRepository<Employee, Long> {

}
