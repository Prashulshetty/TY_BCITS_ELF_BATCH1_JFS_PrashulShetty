package com.bcits.springrestjaxb.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bcits.springrestjaxb.bean.UserInfoBean;

public class UserUnmarshalling {
	public static void main(String[] args) {
		JAXBContext jaxbContext;
		try {
			jaxbContext =JAXBContext.newInstance(UserInfoBean.class);
			Unmarshaller unmarshaller =jaxbContext.createUnmarshaller();
			UserInfoBean userInfo =(UserInfoBean) unmarshaller.unmarshal(new File("userInfo.xml") );
			System.out.println("Emp Id ="+userInfo.getEmpId());
			System.out.println("Emp Name ="+userInfo.getName());
			System.out.println("salary ="+userInfo.getSalary());
			System.out.println("gendr = "+userInfo.getUserOtherInfoBean().getGender());
			System.out.println("Adhar = "+userInfo.getUserOtherInfoBean().getAdhaarNumber());
			
			
			
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		

	}

}
