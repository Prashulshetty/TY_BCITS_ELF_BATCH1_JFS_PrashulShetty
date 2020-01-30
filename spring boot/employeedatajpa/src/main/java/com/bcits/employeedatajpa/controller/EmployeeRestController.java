package com.bcits.employeedatajpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcits.employeedatajpa.beans.EmployeeInfoBean;
import com.bcits.employeedatajpa.beans.EmployeeResponse;
import com.bcits.employeedatajpa.repository.EmployeeRepository;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping(path = "/getEmployee",
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	
	public EmployeeResponse getEmployee(int empId) {
	//	EmployeeInfoBean employeeInfoBean = repository.findById(empId).get();
		Optional<EmployeeInfoBean> op = repository.findById(empId);
		
		EmployeeResponse response = new EmployeeResponse();
		
		if (op.isPresent() ) {
			EmployeeInfoBean employeeInfoBean =op.get();
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee record found for Id" + empId);
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("Employee record is not found");
		}
		return response;
	}

	@GetMapping(path = "/getEmployeeIdPwd",
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	
	public EmployeeResponse getEmployeeQuery(int empId,String password) {
	//	EmployeeInfoBean employeeInfoBean = repository.findById(empId).get();
		EmployeeInfoBean  employeeInfoBean = repository.getEmployee(empId,password);
		
		EmployeeResponse response = new EmployeeResponse();
		
		if (employeeInfoBean != null ) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee record found for Id" + empId);
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("Employee record is not found");
		}
		return response;
	}
	}


