package com.bcits.springrest.exception;

import javax.servlet.http.HttpServletRequest;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bcits.springrest.bean.EmployeeResponse;

@RestControllerAdvice
public class EmployeeRestControllerAdvice {
	@ExceptionHandler(EmployeeException.class)
	public EmployeeResponse handleException(EmployeeException expEx) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("exception");
		response.setDescription(expEx.getMessage());
		return response;
	}

}

