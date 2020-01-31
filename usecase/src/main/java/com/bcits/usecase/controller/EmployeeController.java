package com.bcits.usecase.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@RequestMapping("/employee")
public class EmployeeController {
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

}