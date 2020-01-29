package com.bcits.usecase.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consumer")
public class CustomerController {
	
	@GetMapping("/consumerSignUpPage")
	public String displayConsumerSignUpPage() {
		return "consumerSignUp";
	
	}
	@GetMapping("/consumerLoginPage")
	public String displayConsumerLoginPage() {
		return "consumerLogin";
	
	}

}