package com.bcits.springrestjaxb.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bcits.springrestjaxb.bean.EmployeeBeanInfo;

public class EmployeeUnmarshallingTest {

	public static void main(String[] args) {
		JAXBContext jaxbContext;
		try {
			jaxbContext =JAXBContext.newInstance(EmployeeBeanInfo.class);
			Unmarshaller unmarshaller =jaxbContext.createUnmarshaller();
			EmployeeBeanInfo employeeBeanInfo =(EmployeeBeanInfo) unmarshaller.unmarshal(new File("employeeInfo2.xml") );
			System.out.println("Emp Id ="+employeeBeanInfo.getEmpId());
			System.out.println("Emp Name ="+employeeBeanInfo.getName());
			System.out.println("salary ="+employeeBeanInfo.getSalary());
			
			
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		

	}

}
