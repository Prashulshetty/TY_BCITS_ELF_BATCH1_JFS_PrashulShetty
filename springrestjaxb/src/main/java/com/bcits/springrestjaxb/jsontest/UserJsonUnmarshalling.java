package com.bcits.springrestjaxb.jsontest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.bean.UserInfoBean;



public class UserJsonUnmarshalling {
	public static void main(String[] args) {
		
		
		ObjectMapper objectmapper = new ObjectMapper();
		try {
			UserInfoBean userInfo = objectmapper.readValue(new File("userJson.json"), UserInfoBean.class);
			System.out.println("user Id ="+userInfo.getEmpId());
			System.out.println("user Name ="+userInfo.getName());
			System.out.println("salary ="+userInfo.getSalary());
			System.out.println("date ="+userInfo.getJoiningDate());
			System.out.println("password ="+userInfo.getPassword());
			System.out.println("adhaar ="+userInfo.getUserOtherInfoBean().getAdhaarNumber());
			
			
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
