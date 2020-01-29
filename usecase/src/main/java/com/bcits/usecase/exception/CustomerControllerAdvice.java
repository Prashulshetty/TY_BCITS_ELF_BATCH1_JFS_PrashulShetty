package com.bcits.usecase.exception;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerControllerAdvice {
	@ExceptionHandler(CustomerException.class)
	public String handleException(CustomerException cusEx,HttpServletRequest req) {
		String errMsg = cusEx.getMessage();
		req.setAttribute("errMsg", errMsg);
		return "errPage";
	}

}
