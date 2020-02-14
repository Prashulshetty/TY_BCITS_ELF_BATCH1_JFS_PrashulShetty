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
public class AdminController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/adminLoginPage")
	public String displayAdminLoginPage() {
		return "adminLogin";
	}// end of adminLoginPage

	@PostMapping("/loginAdmin")
	public String adminLogin(int adminId, String password, HttpServletRequest req, ModelMap modelMap) {
		AdminBean admininfo = service.adminLogin(adminId, password);
		if (admininfo != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("adminInfo", admininfo);
			modelMap.addAttribute("msg", "login success...!!");
			return "adminHome";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "adminLogin";
		}
	}// end of loginAdmin

	@GetMapping("/addEmployeePage")
	public String displayAddEmpPage() {
		return "addEmployee";
	}// end of addEmployeePage

	@GetMapping("/deleteEmployeePage")
	public String displayDeleteEmpPage() {
		return "deleteEmployee";
	}// end of deleteEmployeePage

	@PostMapping("/addEmp")
	public String addEmp(EmployeeMasterBean employeeBean, HttpSession session, ModelMap map) {
		AdminBean adminInfo = (AdminBean) session.getAttribute("adminInfo");
		if (adminInfo != null) {
			if (service.addEmp(employeeBean)) {
				map.addAttribute("msg", "Employee details added...");
				return "adminHome";

			} else {
				map.addAttribute("errMsg", "already exists...");
				return "adminHome";
			}
		} else {
			map.addAttribute("errMsg", "Please Login First..");
			return "adminLogin";
		}
	}// end of addEmp

	@PostMapping("/deleteEmp")
	public String deleteEmp(int empId, HttpSession session, ModelMap map) {
		AdminBean adminInfo = (AdminBean) session.getAttribute("adminInfo");
		if (adminInfo != null) {
			if (service.deleteEmp(empId)) {
				map.addAttribute("msg", "Employee details deleted...");
				return "adminHome";

			} else {
				map.addAttribute("errMsg", "Employee details not found..");
				return "adminHome";
			}
		} else {
			map.addAttribute("errMsg", "Please Login First..");
			return "adminLogin";
		}
	}
}// end of deleteEmp
