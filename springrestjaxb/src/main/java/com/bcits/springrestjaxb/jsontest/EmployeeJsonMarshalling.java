package com.bcits.springrestjaxb.jsontest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.bean.EmployeeBeanInfo;

public class EmployeeJsonMarshalling {

	public static void main(String[] args) {
		EmployeeBeanInfo employeeBeanInfo = new EmployeeBeanInfo();
		employeeBeanInfo.setEmpId(100);
		employeeBeanInfo.setBirthDate(new Date());
		employeeBeanInfo.setBloodGroup("O+");
		employeeBeanInfo.setDeptId(10);
		employeeBeanInfo.setDesignation("HR");
		employeeBeanInfo.setJoiningDate(new Date());
		employeeBeanInfo.setMaildId("dev@devraj");
		employeeBeanInfo.setName("DevaRaja");
		employeeBeanInfo.setMgrId(10);
		employeeBeanInfo.setMobileNum(999888000);
		employeeBeanInfo.setPassword("123");
		employeeBeanInfo.setSalary(25000);
		
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writerWithDefaultPrettyPrinter();
			mapper.writeValue(new File("empJson5.json"), employeeBeanInfo);
			mapper.writeValue(System.out, employeeBeanInfo);
			
			
			
		} catch (JsonGenerationException e) {
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
