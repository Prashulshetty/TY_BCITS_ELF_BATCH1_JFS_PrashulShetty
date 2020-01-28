package com.bcits.springrestjaxb.test;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.bcits.springrestjaxb.bean.EmployeeBeanInfo;

public class EmployeeMarshallingTest {
	public static void main(String[] args) {
		
	EmployeeBeanInfo employeeBeanInfo = new EmployeeBeanInfo();
	employeeBeanInfo.setEmpId(100);
	employeeBeanInfo.setBirthDate(new Date());
	employeeBeanInfo.setBloodGroup("O+");
	employeeBeanInfo.setDeptId(10);
	employeeBeanInfo.setDesignation("HR");
	employeeBeanInfo.setJoiningDate(new Date());
	employeeBeanInfo.setMaildId("dev@devraj");
	employeeBeanInfo.setName("Dev");
	employeeBeanInfo.setMgrId(10);
	employeeBeanInfo.setMobileNum(999888000);
	employeeBeanInfo.setPassword("123");
	employeeBeanInfo.setSalary(25000);
	
	try {
		JAXBContext context =JAXBContext.newInstance(EmployeeBeanInfo.class);
		Marshaller marshaller =context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(employeeBeanInfo, System.out);
		marshaller.marshal(employeeBeanInfo, new File("employeeInfo.xml"));
		
		
	} catch (JAXBException e) {
		
		e.printStackTrace();
		System.err.println("unable to Marshall");
	}
	
	
	}

}
