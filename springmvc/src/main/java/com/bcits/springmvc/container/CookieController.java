package com.bcits.springmvc.container;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {
	@GetMapping("/cookiePage")
	public String getCookiePage() {
		return "cookiePage";
	}

	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp,ModelMap modelMap ) {
		Cookie myCookie = new Cookie("empName","DEV");
		resp.addCookie(myCookie);
		modelMap.addAttribute("msg", "cookie created successfully");
		
		return "cookiePage";
	}
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name = "empName",required = false)String employeeName,ModelMap Map ) {
	if(employeeName != null) {
		Map.addAttribute("msg", "cookie value is "+employeeName);
	} else {
		Map.addAttribute("errMsg", "cookie is not present");
	}
		
		return "cookiePage";
	}
}
