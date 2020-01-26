package com.bcits.springmvc.container;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.bcits.springmvc.beans.EmployeeInfoBean;
import com.bcits.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService  service;
	
	
	@GetMapping("/login")
	public  String  displyForm() {
		return "empLoginForm";
		
	}
@PostMapping("/login")
public String  authenticate(int empId, String password,HttpServletRequest req, ModelMap modelMap) {
	
	EmployeeInfoBean employeeInfoBean =service.authenticate(empId, password);
	if(employeeInfoBean != null) {
		HttpSession session =req.getSession(true);
		session.setAttribute("loggedInEmpInfo", employeeInfoBean);
	
		return "employeeHome";
		} else {
			modelMap.addAttribute("errMsg","Invalid credentials");
			return "empLoginForm";
		}
}
@GetMapping("/searchEmpForm")
public String displaySearchEmployeeForm(HttpSession session,ModelMap modelMap) {
	if(session.isNew()) {
		session.invalidate();
		modelMap.addAttribute("errMsg", "Please login first");
		return "empLoginForm";
	} else {
		return "searchEmpForm";
		
	}
}

	@GetMapping("/search")
	  public String searchEmployee(int empId,HttpSession session,ModelMap modelMap) { 
		if(session.getAttribute("loggedInEmpInfo") != null) {
			
			EmployeeInfoBean employeeInfoBean =  service.getEmployee(empId);
			if(employeeInfoBean != null) {
				modelMap.addAttribute("employeeInfoBean", employeeInfoBean);
			} else { 
				modelMap.addAttribute("errMsg", "Employee Id not found!");
			}
			return "searchEmpForm";		
		} else { 
			modelMap.addAttribute("errMsg", "please login first!...");
			return "empLoginForm";
		}
	}
	
	
	@GetMapping("/deleteEmpForm")
	  public String displayDeleteEmployee(
			  @SessionAttribute(name ="loggedInEmpInfo",required = false) EmployeeInfoBean employeeInfoBean,ModelMap modelMap) { 
		
			if(employeeInfoBean != null) {
			
			return "deleteEmpForm";		
		} else { 
			modelMap.addAttribute("errMsg", "please login first!...");
			return "empLoginForm";
		}
	}
	
	@GetMapping("/delete")
	  public String deleteEmployee(
			  @SessionAttribute(name ="loggedInEmpInfo",required = false) EmployeeInfoBean employeeInfoBean,int empId,ModelMap modelMap) { 
		
			if(employeeInfoBean != null) {
				if(service.deletEmployee(empId)) {
				
				modelMap.addAttribute("msg", "Record deleted");
					
		} else { 
			modelMap.addAttribute("errMsg", "Emp records not found for delete...");
			
		}
			return "deleteEmpForm";
	} else {
		modelMap.addAttribute("errMsg", "please login first!...");
		return "empLoginForm";
	}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("errMsg", "your logged out!...");
		return "empLoginForm";
	}
}
