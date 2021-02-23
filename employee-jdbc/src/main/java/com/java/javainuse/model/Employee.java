package com.java.javainuse.model;

public class Employee {

	private String empId;
	private String empName;

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId = " + empId + ", empName = " + empName + "]";
	}

}
