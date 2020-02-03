package com.bcits.usecase.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/adminLoginPage")
	public String displayAdminLoginPage() {
		return "adminLogin";
	}
	@GetMapping("/employeeLoginPage")
	public String displayEmployeeLoginPage() {
		return "employeeLogin";
	}
	
	@GetMapping("/employeeHomePage")
	public String displayConsumerHomePage() {
		return "employeeHome";
	}

	@PostMapping("/adminLogin") 
	public String adminLogin(int adminId, String password ,HttpServletRequest req ,ModelMap modelMap) {
		AdminBean admininfo = service.adminLogin(adminId, password);
		if( admininfo != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("Info", admininfo);
			return "adminHome";
		} else  {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "adminLogin";
		}		
	}
	
	
	@PostMapping("/loginEmployee") 
	public String employeeLogin(int empId, String password ,HttpServletRequest req ,ModelMap modelMap) {
		EmployeeMasterBean empInfo = service.employeelogin(empId, password);
		if( empInfo != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("Info", empInfo);
			return "employeeHome";
		} else  {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}		
	}
}