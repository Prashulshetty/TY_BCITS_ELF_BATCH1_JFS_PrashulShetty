
package com.bcits.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bcits.springboot.beans.EmployeeInfoBean;
import com.bcits.springboot.beans.EmployeeResponse;
import com.bcits.springboot.service.EmployeeService;

//@Controller
@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/getEmployee", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody
	public EmployeeResponse getEmployee(int empId) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		EmployeeResponse response = new EmployeeResponse();
		if (employeeInfoBean != null) {
			response.setStatusCode(201);

			response.setMessage("Success");
			response.setDescription("Employee record found for Id" + empId);
			response.setEmployeeInfoBean(employeeInfoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("Employee record is not found");
		}
		return response;
	}

	@GetMapping(path = "/getAllEmployee", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	// @ResponseBody for restcontroller

	public EmployeeResponse getAllEmployee() {

		List<EmployeeInfoBean> employeeList = service.getAllEmployee();
		EmployeeResponse response = new EmployeeResponse();

		if (employeeList != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription(" record fetched");
			response.setEmployeeList(employeeList);
		} else {
			response.setStatusCode(401);
			response.setMessage("failed");
			response.setDescription("unable to fetch");
		}
		return response;
	}

	
	/*
	 * @DeleteMapping(path = "/deleteEmployee", produces = {
	 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	 * //@DeleteMapping(path = "/deleteEmployee", produces = {
	 * MediaType.APPLICATION_JSON_VALUE, // MediaType.APPLICATION_XML_VALUE })
	 * public boolean deleteEmployee(int empId) { return
	 * service.deletEmployee(empId);
	 * 
	 * }
	 */
	 

	
	  @DeleteMapping(path = "/deleteEmployee/{employeeId}",
			  produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	  public EmployeeResponse deleteEmployee(@PathVariable(name = "employeeId") int empId) {
		  boolean isDeleted = service.deletEmployee(empId);
		  EmployeeResponse response = new EmployeeResponse();
		  if(isDeleted) {
			  response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription(" record deleted");
		  } else {
				response.setStatusCode(401);
				response.setMessage("failed");
				response.setDescription("unable to fetch");
			}
			return response;
	  
	  }
	 

	@PostMapping(path = "/addEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		  boolean isadded = service.addEmployee(employeeInfoBean);
		  EmployeeResponse response = new EmployeeResponse();
		  if(isadded) {
			  response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription(" record added");
		  } else {
				response.setStatusCode(404);
				response.setMessage("failed");
				response.setDescription("unable to add");
			}
			return response;
	  
	  }
		


	@PutMapping(path = "/updateEmployee", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated = service.updateEmployee(employeeInfoBean);
		  EmployeeResponse response = new EmployeeResponse();
		  if(isUpdated) {
			  response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription(" record deleted");
		  } else {
				response.setStatusCode(401);
				response.setMessage("failed");
				response.setDescription("unable to fetch");
			}
			return response;
	  
	  }
		
	

}
