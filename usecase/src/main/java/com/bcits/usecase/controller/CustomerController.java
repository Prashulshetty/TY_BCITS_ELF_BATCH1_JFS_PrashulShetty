package com.bcits.usecase.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.service.CustomerService;



@Controller
//@RequestMapping("/consumer")

public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}
	
	
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
	public String ConsumerLogin(String email, String password ,HttpServletRequest req ,ModelMap modelMap) {
		ConsumerMasterBean consumerInfoBean = service. consumerLogin(email, password);
		if( consumerInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("Info", consumerInfoBean);
			return "customerHome";
		} else  {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "consumerLogin";
		}		
	}


	@GetMapping("/consumerLogout")
	public String consumerLogOut(ModelMap modelMap, HttpSession session) {
		session.invalidate();
		modelMap.addAttribute("errMsg", "You Are Sucessfully Logged Out !!");
		return "home";
	}
	
	/*
	 * @GetMapping("/consumerHomePage") public String displayCustomerHomePage() {
	 * return "customerHome"; }
	 */
	
	@GetMapping("/paymentPage")
	public String displayPaymentPage() {
		return "payment";
	}
	
	@GetMapping("/consumerLoginPage")
	public String displayConsumerLoginPage() {
		return "consumerLogin";
	}
	
	@GetMapping("/consumerHomePage")
	public String displayConsumerHomePage(HttpSession session, ModelMap modelMap) {
		if(session.isNew()) {
			session.invalidate();
			modelMap.addAttribute("errMsg","Please Login First");
			return "consumerLogin";
		}else {
			return "customerHome";
		}
	}
	
	@GetMapping("/consumerBillDisplay")
	public String displayCurrentBillPage(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		if (consumerInfo != null) {
			
			CurrentBillBean bill = service.generateCurrentBill(consumerInfo.getRrNumber());
			
			if (bill != null) {
				modelMap.addAttribute("generatedBill", bill);
				return "currentBill";
			} else {
				modelMap.addAttribute("errMsg", "bill not generated");
				return "customerHome";
			}

		} else {
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "consumerLogin";
		}
	}
	
	@GetMapping("/monthlyConsumptionDisplay")
	public String displayConsumptionPage(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		if (consumerInfo != null) {
			List<MonthlyConsumption> consumptionList =service.getMonthlyConsumptions(consumerInfo.getRrNumber());
			if (consumptionList != null) {
				modelMap.addAttribute("monthlyConsumption", consumptionList);
				return "monthlyConsumption";
			} else {
				modelMap.addAttribute("errMsg", "Service unavailable...");
				return "customerHome";
			}
		} else {
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "consumerLogin";
		}
	}
}