package com.bcits.usecase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consumer")

public class CustomerController {
	@GetMapping("/headerPage")
	public String headerPage() {
		return "header";
	}
	
	@GetMapping("/homePage")
	public String displayHomePage() {
		return "discom";
	}
	
	
	@GetMapping("/consumerSignUpPage")
	public String displayConsumerSignUpPage() {
		return "consumerSignUp";
	}
	
	@GetMapping("/consumerLoginPage")
	public String displayConsumerLoginPage() {
		return "consumerLogin";
	}

}