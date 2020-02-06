package com.bcits.springsecuritymvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;
import com.bcits.springsecuritymvc.service.EmpService;

@Controller
public class EmpSecurityController {
	@Autowired
	private EmpService service;

	@GetMapping("/index")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/register")
	public String getRegisterForm() {
		return "register";
	}

	@PostMapping("/register")
	public String register(EmpInfoBean empInfoBean, ModelMap modelMap) {
		boolean isRegisterd = service.register(empInfoBean);
		if (isRegisterd) {
			modelMap.addAttribute("msg", "success..");

		} else {
			modelMap.addAttribute("errMsg", "failed..");

		}
		return "register";
	}

	@GetMapping("/adminSecureHome")
	public String getAdminHomePage() {
		return "adminHomePage";
	}

	@GetMapping("/userSecureHome")
	public String getUserHomePage() {
		return "userHomePage";
	}
	@GetMapping("/getEmployeeForm")
	public String getEmployeeForm() {
		return "search";
	}
	@GetMapping("/getEmployee")
	public String getEmployee(int empId ,ModelMap modelMap) {
		EmpInfoBean infoBean = service.getEmployee(empId);
		modelMap.addAttribute("empInfo", infoBean);
		return "search";
	}
	@GetMapping("/getAllEmployee")
	public String getAllEmployee(ModelMap modelMap) {
		modelMap.addAttribute("employeeList",service.getAllEmployees());
		return "getAllEmployees";
	}
}
