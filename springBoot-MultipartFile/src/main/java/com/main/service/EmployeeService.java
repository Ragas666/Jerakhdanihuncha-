package com.main.service;

import java.util.List;

import com.main.dto.EmployeeDTO;
import com.main.entity.EmployeeEntity;

public interface EmployeeService {

	EmployeeDTO authenticate(String emailId, String password);

	List<EmployeeDTO> findAllEmployees();

	EmployeeDTO findPassword(String emailId);

	void saveEmployee(EmployeeDTO employeeDTO);

	List<EmployeeDTO> findAllEmployeesByAsc();

	List<EmployeeDTO> findAllEmployeesByDesc();

	List<EmployeeEntity> searchEmployees(String search);

	void delete(int employeeId);

	void updateEmployee(EmployeeDTO employee);

	EmployeeDTO getEmployeeById(int EmployeeId);

}
