package com.main.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.main.dto.EmployeeDTO;
import com.main.entity.EmployeeEntity;
import com.main.repository.MagicDaoRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	// @Qualifier("employeeORMDaoImpl")
	private MagicDaoRepository magicDaoRepository;

	/*********************************************************************************************************************************************/
	@Override
	public EmployeeDTO authenticate(String emailId, String password) {
		System.out.println("from service......");

		Optional<EmployeeEntity> optional = magicDaoRepository.findByEmailIdAndPassword(emailId, password);

		EmployeeDTO employeeDTO = null;
		if (optional.isPresent()) { // check if the query returns some data or not
			EmployeeEntity employeeEntity = optional.get();
			employeeDTO = new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity, employeeDTO);
			return employeeDTO;
		} else {
			return employeeDTO;
		}

	}

	/******************************************************************************************************************************************/
	public List<EmployeeDTO> findAllEmployees() {
		List<EmployeeDTO> employeeDtoList = new ArrayList<>();
		List<EmployeeEntity> employeeEntity = magicDaoRepository.findAll();
		if (employeeEntity.size() > 0) {
			for (EmployeeEntity employee : employeeEntity) {
				EmployeeDTO employeeDto = new EmployeeDTO();
				BeanUtils.copyProperties(employee, employeeDto);
				employeeDtoList.add(employeeDto);
			}

		}

		return employeeDtoList;
	}

	/*********************************************************************************************************************************************/
	@Override
	public EmployeeDTO findPassword(String emailId) {

		Optional<EmployeeEntity> optional = magicDaoRepository.findByEmailId(emailId);

		EmployeeDTO employeeDTO = null;
		if (optional.isPresent()) { // check if the query returns some data or not
			EmployeeEntity employeeEntity = optional.get();
			employeeDTO = new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity, employeeDTO);
			return employeeDTO;
		} else {
			return employeeDTO;
		}
	}

	/**********************************************************************************************************************************************/
	@Override
	public void saveEmployee(EmployeeDTO employeeDTO) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		try {
			employeeEntity.setTphoto(employeeDTO.getFile().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		magicDaoRepository.save(employeeEntity);

	}

	/*********************************************************************************************************************************************/
	@Override
	public List<EmployeeDTO> findAllEmployeesByAsc() {

		List<EmployeeDTO> employeeDtoList = new ArrayList<>();
		List<EmployeeEntity> employeeEntity = magicDaoRepository.findAllByOrderByEmployeeNameAsc();
		if (employeeEntity.size() > 0) {
			for (EmployeeEntity employee : employeeEntity) {
				EmployeeDTO employeeDto = new EmployeeDTO();
				BeanUtils.copyProperties(employee, employeeDto);
				employeeDtoList.add(employeeDto);
			}

		}

		return employeeDtoList;
	}

	/****************************************************************************************************************************************************/
	@Override
	public List<EmployeeDTO> findAllEmployeesByDesc() {

		List<EmployeeDTO> employeeDtoList = new ArrayList<>();
		List<EmployeeEntity> employeeEntity = magicDaoRepository.findAllByOrderByEmployeeNameDesc();
		if (employeeEntity.size() > 0) {
			for (EmployeeEntity employee : employeeEntity) {
				EmployeeDTO employeeDto = new EmployeeDTO();
				BeanUtils.copyProperties(employee, employeeDto);
				employeeDtoList.add(employeeDto);
			}

		}

		return employeeDtoList;
	}

	/*********************************************************************************************************************************************/
	@Override
	public List<EmployeeEntity> searchEmployees(String search) {
		if (search != null) {
			return magicDaoRepository.search(search);
		}
		return magicDaoRepository.findAll();

	}

	/*********************************************************************************************************************************************/

	@Override
	public void delete(int employeeId) {
		magicDaoRepository.deleteById(employeeId);

	}

	/***********************************************************************************************************************************************/
	@Override
	public EmployeeDTO getEmployeeById(int employeeId) {
		Optional<EmployeeEntity> optional = magicDaoRepository.findById(employeeId);
		EmployeeDTO employeeDTO = null;

		if (optional.isPresent()) {
			EmployeeEntity employeeEntity = optional.get();
			employeeDTO = new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity, employeeDTO);
			return employeeDTO;
		} else {
			return employeeDTO;
		}
	}

	@Override
	public void updateEmployee(EmployeeDTO employeeDTO) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		magicDaoRepository.save(employeeEntity);

	}

	/****************************************************************************************************************************************************/

}
