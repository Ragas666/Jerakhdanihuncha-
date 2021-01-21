package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.EmployeeDao;
import com.model.EmployeeDTO;
import com.model.EmployeeEntity;
import com.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeDao employeeDao;

	@GetMapping("/loginn")
	String showLoginPage() {
		return "login";
	}

	@PostMapping("/authenticate")
	String authenticate(@RequestParam String emailid, @RequestParam String password, Model model) {
		System.out.println(emailid + " " + password);
		EmployeeEntity employeeEntity = employeeDao.authenticate(emailid, password);
		if (employeeEntity != null) {
			model.addAttribute("employee", employeeEntity);
			return "showEmployee";
		} else {
			model.addAttribute("msg", "Wrong credential..");
			return "login";
		}
	}

	@GetMapping("/showEmployees")
	String showAllEmployess(Model model) {
		List<EmployeeEntity> employeesList = employeeDao.findAllEmployees();
		model.addAttribute("employeesList", employeesList);

		return "showAllEmployees";

	}

	@GetMapping("/registration")
	String registrationPage() {
		return "empRegistration";
	}

	@PostMapping("/postregistration")
	//String postregistration(@RequestParam String employeename,@RequestParam emailid,@RequestParam password,@RequestParam salary,Model model)
	String postregistration(@RequestParam String employeename, @RequestParam String emailid,@RequestParam String password,@RequestParam int salary, Model model) 
	 { 
		System.out.println(employeename+" "+emailid+" "+password+" "+salary);
		employeeService.postregistration(employeename, emailid, password, salary); 
		
		model.addAttribute("msg", "You have been registered successfully");
		
        return "empRegistration";
	}

	@GetMapping("/logout")
	String initiateLogout(Model model, HttpSession session) {
		if (session != null) {
			session.invalidate();
			model.addAttribute("msg", "User Has Been Logged Out. ");
		}
		return "login";
	}
}
