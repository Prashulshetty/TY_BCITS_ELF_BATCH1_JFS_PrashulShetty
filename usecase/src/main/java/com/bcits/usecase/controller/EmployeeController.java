package com.bcits.usecase.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.service.CustomerService;
import com.bcits.usecase.service.EmployeeService;



@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private CustomerService customerService;
	

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}
	
	@GetMapping("/adminLoginPage")
	public String displayAdminLoginPage() {
		return "adminLogin";
	}

	@GetMapping("/employeeLoginPage")
	public String displayEmployeeLoginPage() {
		return "employeeLogin";
	}
	
	@GetMapping("/generatePage")
		public String displayGeneratePage(ModelMap modelMap, HttpSession session) {
			EmployeeMasterBean employeeInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
			System.out.println(employeeInfo);
			if (employeeInfo != null) {
				List<ConsumerMasterBean> consumers = service.showAllConsumer(employeeInfo.getRegion());
				System.out.println(consumers);
				if (!consumers.isEmpty()) {
					modelMap.addAttribute("consumers", consumers);
				} else {
					modelMap.addAttribute("errMsg", "No records found");
				}
				return "generate";
			} else {
				modelMap.addAttribute("errMsg", "Please login first !!");
				return "employeeLogin";
			}
		}

	@GetMapping("/employeeHomePage")
	public String displayConsumerHomePage(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean employeeInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		long count = service.numberOfConsumer(employeeInfo.getRegion());
		if (employeeInfo != null) {
			modelMap.addAttribute("count", count);
			return "employeeHome";
		}
		return "employeeLogin";
	}

	@PostMapping("/loginAdmin") 
	public String adminLogin(int adminId, String password ,HttpServletRequest req ,ModelMap modelMap){
		AdminBean admininfo = service.adminLogin(adminId, password);
		if( admininfo != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("adminInfo", admininfo);
			modelMap.addAttribute("msg", "login success...!!");
			return "addEmployee";
		} else  {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "adminLogin";
		}		
	}
	
	@PostMapping("/addEmp")
	public String addEmp(EmployeeMasterBean employeeBean,HttpSession session,ModelMap map) {
		AdminBean adminInfo = (AdminBean) session.getAttribute("adminInfo");
		if (adminInfo != null) {
		if(service.addEmp(employeeBean)) {
			map.addAttribute("msg", "Employee details added...");
			//return "addEmpPage";
			return "addEmployee";
			
		} else { 
			map.addAttribute("errMsg", "already exists...");
		return "addEmployee";
	} 
		} else {
		map.addAttribute("errMsg", "Please Login First..");
		return "adminLogin";
	}
		}
	
	
	@GetMapping("/getConsumersDetails")
	public String getAllConsumer(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean employeeInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		System.out.println(employeeInfo);
		if (employeeInfo != null) {
			List<ConsumerMasterBean> consumers = service.showAllConsumer(employeeInfo.getRegion());
			System.out.println(consumers);
			if (!consumers.isEmpty()) {
				modelMap.addAttribute("consumers", consumers);
			} else {
				modelMap.addAttribute("errMsg", "No records found");
			}
			return "allConsumers";
		} else {
			modelMap.addAttribute("errMsg", "Please login first !!");
			return "employeeLogin";
		}
	}
	 
	
	
	@PostMapping("/loginEmployee") 
	public String employeeLogin(int empId, String password ,HttpServletRequest req ,ModelMap modelMap) {	
		EmployeeMasterBean empInfo = service.employeelogin(empId, password);
		long count = service.numberOfConsumer(empInfo.getRegion());
		System.out.println(count);
		if( empInfo != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("empInfo", empInfo);
			modelMap.addAttribute("count", count);
			return "employeeHome";
		} else  {
       modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
}		
	}
	@GetMapping("/empLogout")
	public String consumerLogOut(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean employeeInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (employeeInfo != null) {
			session.invalidate();
			modelMap.addAttribute("msg", "Logged Out..");
		} else {
		modelMap.addAttribute("errMsg", "please Login first");	
		}
		return "home";		
	}

	@GetMapping("/generateBillPage")
	public String dispalyBillGeneratorPage(String rrNumber,ModelMap modelMap, HttpSession session) {
		System.out.println(rrNumber);
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		System.out.println(empInfo);
		if (empInfo != null) {
			System.out.println(empInfo);
			ConsumerMasterBean consumerInfo = customerService.getCustomer(rrNumber);
			
			System.out.println(consumerInfo);

			double previous = customerService.getPreviousReading(rrNumber);
			
			System.out.println(consumerInfo);
			System.out.println(previous);
			
			if (consumerInfo != null) {
				modelMap.addAttribute("consumerInfo", consumerInfo);
				modelMap.addAttribute("previous", previous);
				System.out.println(previous);
			}
			
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}
		return "generateBill";
	}
	
	@GetMapping("/billGenerate")
	public String generateBill(ModelMap modelMap, HttpSession session, CurrentBillBean currentBill) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		System.out.println(empInfo);
		if (empInfo != null) {
			List<ConsumerMasterBean> consumers = service.showAllConsumer(empInfo.getRegion()); 
			

			System.out.println(consumers);
			if (service.addCurrentBill(currentBill)) {
				modelMap.addAttribute("msg","Bill Generated Sucessfully..");
				modelMap.addAttribute("consumers", consumers);

			} else {
				modelMap.addAttribute("errMsg", " bill not generated...!");
				modelMap.addAttribute("consumers", consumers);

			}
			return "generate";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}
	}
	
	@GetMapping("/seeAllBills")
	public String displayConsumptionPage(HttpSession session, ModelMap modelMap) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		System.out.println(empInfo);
		if (empInfo != null) {
		//	System.out.println(empInfo.getRegion());
			List<MonthlyConsumption> billList =customerService.getAllBills(empInfo.getRegion());
			System.out.println(billList);
			if (!billList.isEmpty()) {
				modelMap.addAttribute("bills", billList);
			} else {
				modelMap.addAttribute("errMsg", "No records found for Display..");
			}
			return "seeGeneratedBill";
		} 
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "employeeLogin";
		
	}
	
}