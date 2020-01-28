package com.bcits.springrestjaxb.jsontest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.bean.EmployeeBeanInfo;

public class EmployeeJsonUnmarshalling {
	public static void main(String[] args) {
		
	
	ObjectMapper objectmapper = new ObjectMapper();
	try {
		EmployeeBeanInfo employeeBeanInfo = objectmapper.readValue(new File("empJson5.json"), EmployeeBeanInfo.class);
		System.out.println("Emp Id ="+employeeBeanInfo.getEmpId());
		System.out.println("Emp Name ="+employeeBeanInfo.getName());
		System.out.println("salary ="+employeeBeanInfo.getSalary());
		System.out.println("date ="+employeeBeanInfo.getJoiningDate());
		System.out.println("password ="+employeeBeanInfo.getPassword());
		
		
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}