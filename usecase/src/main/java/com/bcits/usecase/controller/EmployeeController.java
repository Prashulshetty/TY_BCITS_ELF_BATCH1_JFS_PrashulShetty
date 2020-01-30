package com.bcits.usecase.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/employeeLoginPage")
	public String displayConsumerSignUpPage() {
		return "employeeLogin";
	}
	
	@GetMapping("/employeeHomePage")
	public String displayConsumerLoginPage() {
		return "employeeHome";
	}

}