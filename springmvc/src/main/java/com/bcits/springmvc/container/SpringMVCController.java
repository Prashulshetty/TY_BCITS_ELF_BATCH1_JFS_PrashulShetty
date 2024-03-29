package com.bcits.springmvc.container;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SpringMVCController {
	
@RequestMapping(path = "/hello", method = RequestMethod.GET)
//handler method
public ModelAndView displayWelcomeMessage() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("WEB-INF/views/messagePage.jsp");
	return modelAndView;
}

@RequestMapping(path = "/searchEmployee", method = RequestMethod.GET)
public ModelAndView searchEmployee(HttpServletRequest req) {
	String empIDval = req.getParameter("empId");
	
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("WEB-INF/views/searchEmployee.jsp");
	req.setAttribute("empId",empIDval);
	return modelAndView;
}

	/*
	 * @RequestMapping(path = "/loginForm", method = RequestMethod.GET) public
	 * ModelAndView displayLoginForm() { ModelAndView modelAndView = new
	 * ModelAndView(); modelAndView.setViewName("WEB-INF/views/loginForm.jsp");
	 * return modelAndView; }
	 */

//spring creates ModelAndView modelAndView
@RequestMapping(path = "/loginForm", method = RequestMethod.GET)
public ModelAndView displayLoginForm(ModelAndView modelAndView) {
	//modelAndView.setViewName("WEB-INF/views/loginForm.jsp");
	modelAndView.setViewName("loginForm");
	return modelAndView;
}

@RequestMapping(path = "/login1", method = RequestMethod.POST)
public ModelAndView searchEmployee(HttpServletRequest req,ModelAndView modelAndView) {
	String empIdVal = req.getParameter("empId");
	int empId =Integer.parseInt(empIdVal);
	String password = req.getParameter("password");
	
	modelAndView.addObject("empId",empId );
	modelAndView.addObject("pwd",password );
	
	modelAndView.setViewName("WEB-INF/views/userDetails.jsp");
	
	return modelAndView;
}

@PostMapping("/login2")
public ModelAndView login2(@RequestParam(name="empId") int empId,
		@RequestParam(name="password") String password,ModelAndView modelAndView) {
	modelAndView.addObject("empId",empId );
	modelAndView.addObject("pwd",password );
	modelAndView.setViewName("WEB-INF/views/userDetails.jsp");
	return modelAndView;
}
@PostMapping("/login3")
public String login3(int empId,String password,ModelMap modelMap) {
	modelMap.addAttribute("empId",empId );
	modelMap.addAttribute("pwd",password );
	return "/WEB-INF/views/userDetails.jsp";
}
//using bean class
	/*
	 * @PostMapping("/login4") public String login4(UserBean userBean,ModelMap
	 * modelMap) { modelMap.addAttribute("UserBean",userBean );
	 * 
	 * return "/WEB-INF/views/userDetails2.jsp"; }
	 */
//using bean and input field name

@PostMapping("/login4")
public String login4(UserBean userBean,String name,ModelMap modelMap) {
	modelMap.addAttribute("UserBean",userBean );
	modelMap.addAttribute("name", name);
	
	
	return "userDetails2";
}

}//end class
