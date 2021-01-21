package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.EmployeeEntity;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeEntity authenticate(String emailid, String password) {

		EmployeeEntity employeeEntity = null;

		String sql = "Select * from employee where emailId = ? and password = ? ";
		Object[] data = { emailid, password };
		try {
			employeeEntity = jdbcTemplate.queryForObject(sql, data, new BeanPropertyRowMapper<>(EmployeeEntity.class));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return employeeEntity;
	}

	@Override
	public List<EmployeeEntity> findAllEmployees() {

		String sql = "select * from employee";
		List<EmployeeEntity> employeeEntityList = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper<>(EmployeeEntity.class));

		return employeeEntityList;
	}

	

	@Override
	public EmployeeEntity postregistration(String employeename, String emailid, String password, int salary) {
		System.out.println("Rupace got here");
		EmployeeEntity employeeEntity = null;
		String sql = "insert into employee(employeename,emailid,password,salary) values(?,?,?,?)";
		Object[] data = { employeename, emailid, password, salary };
		for (Object d : data) {
			System.out.println(d);
			
		}

		try {
			System.out.println("Inside try");
			 jdbcTemplate.update(sql, data);
			 System.out.println("Stored Successsfully");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return employeeEntity;

	}

}
