package com.main.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.dto.EmployeeDTO;
import com.main.entity.EmployeeEntity;
import com.main.service.EmployeeService;

@Controller

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**************************************************************************************************************************************************/
	@GetMapping("/Logout")//session for the logging out the data 
	String logout(Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}

		return "home";

	}

	/******************************************************************************************************************************************/
	@GetMapping("/login") // call login.jsp
	String showLoginPage() {

		return "login";

	}

	@PostMapping("/authenticate") // authenticate using service layer
	String authenticateEmp(@RequestParam String emailId, @RequestParam String password, Model model) {

		EmployeeDTO employeeDto = employeeService.authenticate(emailId, password);
		if (employeeDto != null) {
			model.addAttribute("employee", employeeDto);
			return "showEmployee";
		} else {
			model.addAttribute("msg", "Wrong credential..");
			return "login";
		}

	}

	/******************************************************************************************************************************************/
	@PostMapping("/registration")//url linked for submitting the registration page
	public String registration(@ModelAttribute EmployeeDTO EmployeeDto) {
		employeeService.saveEmployee(EmployeeDto);

		return "redirect:/showEmployees";
	}

	@GetMapping("employeeRegistration")// URL is linked to the show all jsp href
	public String registrationPage() {

		return "employeeRegistration";
	}

	/******************************************************************************************************************************************/
	@GetMapping("/showEmployees")
	String showAllEmployees(Model model) {
		List<EmployeeDTO> employeeDtoList = employeeService.findAllEmployees();
	//	model.addAttribute("allEmployees", employeeDtoList);
		List<EmployeeDTO> employeeDtoList2=new ArrayList<>();
		
		for(EmployeeDTO employee:employeeDtoList) {
			byte[] b=employee.getTphoto();
            byte[] encodeBase64 = Base64.getEncoder().encode(b);
            try {
                String base64DataString = new String(encodeBase64 , "UTF-8");
                employee.setPhoto(base64DataString);
                //photoList.add(base64DataString);
                employeeDtoList2.add(employee);
                
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		}
		
		model.addAttribute("allEmployees", employeeDtoList2);
		return "showAllEmployees";
	}

	/********************************************************************************************************************************************/

	@GetMapping("/delete")
	public String deteleEmployee(@RequestParam int employeeId, Model model) {
		employeeService.delete(employeeId);

		return "redirect:/showEmployees";
	}

	/************************************************************************************************************************************************/

	@PostMapping("/update") // mapping while submitting the edit form
	public String updateFaculty(@ModelAttribute EmployeeDTO employee, Model model) {
		employeeService.updateEmployee(employee);
		model.addAttribute("employee", employee);// model.addAttribute("message", "your profile updated");

		return "redirect:/showEmployees";
	}

	@GetMapping("/updatePrfl") // URL is linked to the show all jsp href
	public String updateFaculty(@ModelAttribute EmployeeDTO employee, @RequestParam int employeeId, Model model) {

		EmployeeDTO getEmployee = employeeService.getEmployeeById(employeeId);
		model.addAttribute("employee", getEmployee);
		System.out.println("from profile " + employee);

		return "editEmployee";

	}

	/*******************************************************************************************************************************************/
	@GetMapping("/forgotPassword") // URL is linked to the show all jsp href
	public String FindPasswordPage() {

		return "forgotPassword";
	}

	@PostMapping("/forgeet")//submitting forgot password
	public String GetYourPassword(@RequestParam String emailId, Model model) {

		EmployeeDTO employeeDTO = employeeService.findPassword(emailId);
		if (employeeDTO != null) {
			model.addAttribute("password", employeeDTO.getPassword());
		} else {
			model.addAttribute("incorrect", "doesnot exist in the database");
		}
		return "forgotPassword";

	}

	/********************************************************************************************************************************************/
	@GetMapping("/ascByName")
	public String ascendingOrder(Model model) {
		List<EmployeeDTO> employeeDtoList = employeeService.findAllEmployeesByAsc();
		model.addAttribute("allEmployees", employeeDtoList);

		return "showAllEmployees";
	}

	/******************************************************************************************************************************************/
	@GetMapping("/descByName")
	public String descendinOrder(Model model) {
		List<EmployeeDTO> employeeDtoList = employeeService.findAllEmployeesByDesc();
		model.addAttribute("allEmployees", employeeDtoList);

		return "showAllEmployees";
	}

	/******************************************************************************************************************************************/
	@PostMapping("/searchEmployee")
	public String search(@RequestParam String search, Model model) {
		List<EmployeeEntity> employeeDtoList = employeeService.searchEmployees(search);
		model.addAttribute("allEmployees", employeeDtoList);

		return "showAllEmployees";
	}

}
