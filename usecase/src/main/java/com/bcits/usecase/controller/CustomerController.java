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

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.QueryMsgBean;
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
	public String add(ConsumerMasterBean consumerBean, String conPwd, ModelMap map) {
		if (service.consumerSignUp(consumerBean, conPwd)) {
			map.addAttribute("msg", "signup success...");
			return "consumerLogin";
		} else {
			map.addAttribute("errMsg", "already exists...");
		}

		return "consumerSignUp";
	}

	@PostMapping("/LoginPage")
	public String ConsumerLogin(String email, String password, HttpServletRequest req, ModelMap modelMap) {
		ConsumerMasterBean consumerInfoBean = service.consumerLogin(email, password);
		if (consumerInfoBean != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("Info", consumerInfoBean);
			return "customerHome";
		} else {
			modelMap.addAttribute("errMsg", "Invalid Credential !!");
			return "consumerLogin";
		}
	}

	@GetMapping("/consumerLogout")
	public String consumerLogOut(ModelMap modelMap, HttpSession session) {
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		if (consumerInfo != null) {
			session.invalidate();
			modelMap.addAttribute("msg", "Logged Out..");
		} else {
			modelMap.addAttribute("errMsg", "please Login first");
		}
		return "home";
	}

	@GetMapping("/payOnline")
	public String displayPaymentPage(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		if (consumerInfo != null) {
			return "payment";
		} else {
			modelMap.addAttribute("errMsg", "please Login first");
			return "consumerLogin";
		}
	}

	@PostMapping("/paySuccess")
	public String sucessfullPayment(HttpSession session, ModelMap modelMap, int amount) {
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		Date date = new Date();
		if (consumerInfo != null) {
			System.out.println(date);
			System.out.println(consumerInfo.getRrNumber());
			System.out.println(amount);
			boolean pay = service.payment(consumerInfo.getRrNumber(), date, amount);
			System.out.println(pay);
			if (pay == true) {
				modelMap.addAttribute("msg", "payment successful..");
				return "payment";
			} else {
				modelMap.addAttribute("errMsg", "payment already done...");
				return "payment";
			}
		} else {
			return "consumerLogin";
		}
	}

	@GetMapping("/consumerLoginPage")
	public String displayConsumerLoginPage() {
		return "consumerLogin";
	}

	@GetMapping("/consumerHomePage")
	public String displayConsumerHomePage(HttpSession session, ModelMap modelMap) {
		if (session.isNew()) {
			session.invalidate();
			modelMap.addAttribute("errMsg", "Please Login First");
			return "consumerLogin";
		} else {
			return "customerHome";
		}
	}

	@GetMapping("/consumerBillDisplay")
	public String displayCurrentBillPage(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		if (consumerInfo != null) {

			CurrentBillBean bill = service.showCurrentBill(consumerInfo.getRrNumber());

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

	@GetMapping("/monthlyConsumptions")
	public String displayConsumptionPage(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		System.out.println(consumerInfo);
		if (consumerInfo != null) {
			List<MonthlyConsumption> consumptionList = service.getMonthlyConsumptions(consumerInfo.getRrNumber());
			System.out.println(consumptionList);
			if (!consumptionList.isEmpty()) {
				modelMap.addAttribute("monthlyConsumption", consumptionList);
				return "monthlyConsumption";
			} else {
				modelMap.addAttribute("errMsg", "Details not found for display...");
				return "customerHome";
			}
		} else {
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "consumerLogin";
		}
	}

	@GetMapping("/billHistoryDisplay")
	public String displayBillHistory(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		if (consumerInfo != null) {
			List<BillHistoryBean> history = service.showBillHistory(consumerInfo.getRrNumber());

			if (!history.isEmpty()) {
				modelMap.addAttribute("history", history);
				return "billHistory";
			} else {
				modelMap.addAttribute("errMsg", "No Bill history found for display..");
				return "customerHome";
			}
		} else {
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "consumerLogin";
		}
	}
	
	
	@GetMapping("/query")
	public String QuerySubmit(HttpSession session, ModelMap modelMap, String query) {
		System.out.println(query);
		ConsumerMasterBean consumerInfo = (ConsumerMasterBean) session.getAttribute("Info");
		if (consumerInfo != null) {
			if (service.setQuery(query, consumerInfo.getRrNumber(), consumerInfo.getRegion())) {
				modelMap.addAttribute("msg", "query sent..");
			}
			return "customerHome";
		} else {
			modelMap.addAttribute("errMsg", "Please Login First..");
			return "consumerLogin";
		}

	}
	@GetMapping("/seeResponse")
	public String seeResponse(HttpSession session, ModelMap modelMap) {
		ConsumerMasterBean consumerInfoBean = (ConsumerMasterBean) session.getAttribute("Info");
		if (consumerInfoBean != null) {
		
			List<QueryMsgBean> response = service.getResponse(consumerInfoBean.getRrNumber());
			modelMap.addAttribute("response",response);
			return "responsePage";
	}else {
		modelMap.addAttribute("errMsg", "Please Login First..");
		return "consumerLogin";
		}
	}

}