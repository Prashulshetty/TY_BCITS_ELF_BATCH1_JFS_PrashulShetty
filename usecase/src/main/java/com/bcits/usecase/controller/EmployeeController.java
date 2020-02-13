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
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.dao.GenerateMail;
import com.bcits.usecase.service.CustomerService;
import com.bcits.usecase.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@Autowired
	private CustomerService customerService;

	private GenerateMail generateMail = new GenerateMail();

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@GetMapping("/employeeLoginPage")
	public String displayEmployeeLoginPage() {
		return "employeeLogin";
	}

	@GetMapping("/generatePage")
	public String displayGeneratePage(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean employeeInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (employeeInfo != null) {
			List<ConsumerMasterBean> consumers = service.showAllConsumer(employeeInfo.getRegion());
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
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		
		if (empInfo != null) {
			long count = service.numberOfConsumer(empInfo.getRegion());
			double totalBill = customerService.totalBill(empInfo.getRegion());
			double collectedBill = customerService.collectedBill(empInfo.getRegion());
			modelMap.addAttribute("count", count);
			modelMap.addAttribute("totalBill", totalBill);
			modelMap.addAttribute("collectedBill", collectedBill);
			return "employeeHome";
		}
		return "employeeLogin";
	}

	@GetMapping("/getConsumersDetails")
	public String getAllConsumer(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean employeeInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (employeeInfo != null) {
			List<ConsumerMasterBean> consumers = service.showAllConsumer(employeeInfo.getRegion());
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
	public String employeeLogin(int empId, String password, HttpServletRequest req, ModelMap modelMap) {
		EmployeeMasterBean empInfo = service.employeelogin(empId, password);
		if (empInfo != null) {
			long count = service.numberOfConsumer(empInfo.getRegion());
			double totalBill = customerService.totalBill(empInfo.getRegion());
			double collectedBill = customerService.collectedBill(empInfo.getRegion());
			HttpSession session = req.getSession(true);
			session.setAttribute("empInfo", empInfo);
			modelMap.addAttribute("count", count);
			modelMap.addAttribute("totalBill", totalBill);
			modelMap.addAttribute("collectedBill", collectedBill);
			return "employeeHome";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}
	}

	@GetMapping("/passwordChange")
	public String displayPasswordForgot(HttpSession session, ModelMap modelMap) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (empInfo != null) {
			return "passwordPage";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "employeeLogin";
		}
	}

	@PostMapping("/password")
	public String password(HttpSession session, ModelMap modelMap, String password, String cPassword) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (empInfo != null) {
			if (service.updatePassword(password, cPassword, empInfo.getEmpId())) {
				modelMap.addAttribute("msg", "Password Changed....");
			} else {
				modelMap.addAttribute("errMsg", "Password not Changed....");
			}
			return "employeeLogin";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First..");
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
	public String dispalyBillGeneratorPage(String rrNumber, ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (empInfo != null) {
			ConsumerMasterBean consumerInfo = customerService.getCustomer(rrNumber);
			double previous = customerService.getPreviousReading(rrNumber);
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
		if (empInfo != null) {
			List<ConsumerMasterBean> consumers = service.showAllConsumer(empInfo.getRegion());
			CurrentBillBean bill = service.addCurrentBill(currentBill, empInfo.getRegion());
			if (bill != null) {
				ConsumerMasterBean consumerInfo = customerService.getCustomer(currentBill.getRrNumber());
				generateMail.sendMail(currentBill, consumerInfo);
				modelMap.addAttribute("msg", "Bill Generated Sucessfully..");
				modelMap.addAttribute("consumers", consumers);
			} else {
				modelMap.addAttribute("errMsg", " This month bill already exists...!");
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
		if (empInfo != null) {
			List<MonthlyConsumption> billList = customerService.getAllBills(empInfo.getRegion());
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

	@GetMapping("/seeQueryDetails")
	public String diplayQueryDetails(ModelMap modelMap, HttpSession session) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (empInfo != null) {
			List<QueryMsgBean> queryList = service.getQueryList(empInfo.getRegion());
			if (queryList != null && !queryList.isEmpty()) {
				modelMap.addAttribute("query", queryList);
			} else {
				modelMap.addAttribute("errMsg", "No queries....");
			}
			return "queryListPage";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}
	}

	@PostMapping("/sendResponse")
	public String addResponses(ModelMap modelMap, HttpSession session, String rrNumber, String query, Date date) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (empInfo != null) {
			List<QueryMsgBean> queryList = service.getQueryList(empInfo.getRegion());
			modelMap.addAttribute("query", queryList);
			if (service.sendRespond(rrNumber, query, date)) {
				modelMap.addAttribute("msg", "Sent");
			}
			return "queryListPage";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}

	}

	@GetMapping("/revenue")
	public String getmonthlyRevenuePage(HttpSession session,ModelMap modelMap) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (empInfo != null) {
			modelMap.addAttribute("paidBill", service.getPaidBills(empInfo.getRegion()));
			return "monthlyRevenue";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "employeeLogin";
		}
	}
	
	@GetMapping("/payBillPage")
	public String displayPayBillPage() {
		return "payBill";
	}

	@PostMapping("/payBills")
	public String payBill(ModelMap modelMap, HttpSession session, String rrNumber,int billAmount) {
		EmployeeMasterBean empInfo = (EmployeeMasterBean) session.getAttribute("empInfo");
		if (empInfo != null) {
			boolean status = customerService.getStatus(rrNumber);
			if(status == true) {
				Date date =new Date();
			boolean pay = customerService.payment(rrNumber, date, billAmount);
			if (pay == true) {
				modelMap.addAttribute("msg", "payment successful..");
				return "payBill";
			} else {
				modelMap.addAttribute("errMsg", "payment not successful...");
				return "payBill";
			}
			} else {
				modelMap.addAttribute("errMsg", "this month payment already done...");
				return "payBill";
			}
		} else {
			return "employeeLogin";
		}
	}

}