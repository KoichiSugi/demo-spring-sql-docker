package com.java.javainuse.service;

import java.util.List;

import com.java.javainuse.model.Employee;

// service interface to specify employee operations to be performed
public interface EmployeeService {
	List<Employee> getAllEmployees();

	void insertEmployee(Employee employee);

}
