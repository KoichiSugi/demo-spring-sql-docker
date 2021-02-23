package com.java.javainuse.dao;

import java.util.List;

import com.java.javainuse.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();

	void insertEmployee(Employee employee);

}
