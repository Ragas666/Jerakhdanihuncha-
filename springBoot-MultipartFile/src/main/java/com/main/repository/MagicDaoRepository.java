package com.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.main.entity.EmployeeEntity;



public interface MagicDaoRepository extends JpaRepository<EmployeeEntity, Integer> {
	
	Optional<EmployeeEntity>  findByEmailIdAndPassword(String email,String pass);


	Optional<EmployeeEntity> findByEmailId(String emailId);
	
	@Query("SELECT p FROM EmployeeEntity p WHERE CONCAT(p.employeeName, p.emailId) LIKE %?1%")
	List<EmployeeEntity> search(String search);


	List<EmployeeEntity> findAllByOrderByEmployeeNameAsc();


	List<EmployeeEntity> findAllByOrderByEmployeeNameDesc();


}