
  package com.service;
  
  import com.model.EmployeeDTO;
  
  public interface EmployeeService {
  
  EmployeeDTO authenticate(String emailid,String password) ;
  EmployeeDTO postregistration(String employeename,String emailid,String password,int salary); 
  
  }
 