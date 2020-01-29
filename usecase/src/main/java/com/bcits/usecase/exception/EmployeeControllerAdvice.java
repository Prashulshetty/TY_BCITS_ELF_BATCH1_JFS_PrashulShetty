package com.bcits.usecase.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeControllerAdvice {
	@ExceptionHandler(EmployeeException.class)
	public String handleException(EmployeeException expEx,HttpServletRequest req) {
		String errMsg = expEx.getMessage();
		req.setAttribute("errMsg", errMsg);
		return "errPage";
	}

}
