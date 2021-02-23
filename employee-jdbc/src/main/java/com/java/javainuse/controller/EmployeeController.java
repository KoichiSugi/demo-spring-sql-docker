package com.java.javainuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.javainuse.model.Employee;
import com.java.javainuse.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {

		return employeeService.getAllEmployees();

	}

	@PostMapping(value = "/insertemployee")
	public void insertEmployee(@RequestBody Employee employee) {
		employeeService.insertEmployee(employee);
	}

}
