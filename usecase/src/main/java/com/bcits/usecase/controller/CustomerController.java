package com.bcits.usecase.controller;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.service.CustomerService;

@Controller
//@RequestMapping("/consumer")

public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/headerPage")
	public String headerPage() {
		return "header";
	}
	
	@GetMapping("/homePage")
	public String displayHomePage() {
		return "home";
	}
	@GetMapping("/aboutUsPage")
	public String displayAboutPage() {
		return "aboutUs";
	}
	
	@GetMapping("/consumerSignUpPage")
	public String displayConsumerSignUpPage() {
		return "consumerSignUp";
	}
	
	@PostMapping("/signUpPage")
	public String add(ConsumerMasterBean consumerBean, String conPwd,ModelMap map) {
		if(service.consumerSignUp(consumerBean, conPwd)) {
			map.addAttribute("msg", "signup success...");
			return "consumerLogin";
		} else { 
			map.addAttribute("errMsg", "already exists...");
		}  
		
		return "consumerLogin";
	}
	
	@PostMapping("/LoginPage") 
	public String ConsumerLogin(String rrNumber, String password ,HttpServletRequest req ,ModelMap modelMap) {
		ConsumerMasterBean consumerInfoBean = service. consumerLogin(rrNumber, password);
		if( consumerInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("loggedInCons", consumerInfoBean);
			return "customerHome";
		}else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "consumerLogin";
		}		
	}

	
	@GetMapping("/consumerLogout")
	public String consumerLogOut(ModelMap modelMap, HttpSession session) {
		session.invalidate();
		modelMap.addAttribute("errMsg", "You Are Sucessfully Logged Out !!");
		return "consumerLogin";
	}
	
	
	@GetMapping("/consumerHomePage")
	public String displayCustomerHomePage() {
		return "customerHome";
	}
	
	@GetMapping("/paymentPage")
	public String displayPaymentPage() {
		return "payment";
	}
	
	@GetMapping("/consumerLoginPage")
	public String displayConsumerLoginPage() {
		return "consumerLogin";
	}
	
		
	
}