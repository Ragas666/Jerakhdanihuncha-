
package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.EmployeeDTO;
import com.model.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public EmployeeDTO authenticate(String emailid, String password) {
		System.out.println("I am from service" + emailid + "" + password);
		return null;
	}

	@Override
	public EmployeeDTO postregistration(String employeename, String emailid, String password, int salary) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		//EmployeeDao.postregistration(employeename, emailid, password, salary);
		//EmployeeEntity employeeEntity
		 employeeDao.postregistration(employeename, emailid, password, salary);
		return null;
	}

	
}