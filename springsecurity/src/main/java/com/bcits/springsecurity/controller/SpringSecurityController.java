package com.bcits.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpringSecurityController {
	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	@GetMapping("/adminSecureHome")
	public String getadminHomePage() {
		return "adminHomePage";
	}
	@GetMapping("/userSecureHome")
	public String getuserSecureHome() {
		return "userHomePage";
	}
	@GetMapping("/login")
	public String getloginForm() {
		return "loginForm";
	}
	
}
