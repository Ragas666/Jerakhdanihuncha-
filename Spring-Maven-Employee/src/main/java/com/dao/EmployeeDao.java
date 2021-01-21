package com.dao;

import java.util.List;

import com.model.EmployeeEntity;
import com.model.EmployeeEntity;


public interface EmployeeDao {
	EmployeeEntity authenticate(String emailId, String password);

	List<EmployeeEntity> findAllEmployees();
	
	

	EmployeeEntity postregistration(String employeename, String emailid, String password, int salary);

}
