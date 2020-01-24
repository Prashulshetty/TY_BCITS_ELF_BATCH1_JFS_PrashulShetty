package com.bcits.springmvc.container;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligationController {
	@GetMapping("/redirect")
	public String redirectRequest() {
		return "redirect:https://www.github.com";
	}
	@GetMapping("/forward")
	public String forwardRequest() {
		return "forward:loginForm";
	}
	@GetMapping("/include")
	public String includeRequest() {
		return "include:loginForm";
	}

}//end class
