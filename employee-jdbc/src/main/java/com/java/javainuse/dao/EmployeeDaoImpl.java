package com.java.javainuse.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.java.javainuse.model.Employee;

//repository annotation indicates the class provides the mechanism for storage, search and CRUD operation on objects
@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	// factory for connections to any physical data source

	@Autowired
	DataSource dataSource;

	// The PostConstruct annotation is used on a method
	// that needs to be executed after dependency injection is done to perform any
	// initialization
	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM employee";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<Employee> result = new ArrayList<Employee>();
		for (Map<String, Object> row : rows) {
			Employee employee = new Employee();
			employee.setEmpId((String) row.get("empId"));
			employee.setEmpName((String) row.get("empName"));
			result.add(employee);
		}
		return result;
	}

	@Override
	public void insertEmployee(Employee employee) {
		String sql = "INSERT INTO employee " + "(empId, empName) values (?,?)";
		getJdbcTemplate().update(sql, new Object[] { employee.getEmpId(), employee.getEmpName() });
	}

}
