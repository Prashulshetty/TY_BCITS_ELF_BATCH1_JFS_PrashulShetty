package com.bcits.springrestjaxb.jsontest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bcits.springrestjaxb.bean.UserAddressBean;
import com.bcits.springrestjaxb.bean.UserInfoBean;
import com.bcits.springrestjaxb.bean.UserOtherInfoBean;

public class userJsonmarshalling {

	public static void main(String[] args) {
		UserInfoBean userInfo = new UserInfoBean();
		userInfo.setEmpId(100);
		userInfo.setBirthDate(new Date());
		userInfo.setBloodGroup("O+");
		userInfo.setDeptId(10);
		userInfo.setDesignation("HR");
		userInfo.setJoiningDate(new Date());
		userInfo.setMaildId("dev@devraj");
		userInfo.setName("Dev");
		userInfo.setMgrId(10);
		userInfo.setMobileNum(999888000);
		userInfo.setPassword("123");
		userInfo.setSalary(25000);
		
		UserOtherInfoBean userOtherInfoBean =new UserOtherInfoBean();
		
		userOtherInfoBean.setGender("male");
		userOtherInfoBean.setAdhaarNumber(666666666L);;
		userInfo.setUserOtherInfoBean(userOtherInfoBean);
		userOtherInfoBean.setGender("male");
		userOtherInfoBean.setAdhaarNumber(666666666L);;
		userInfo.setUserOtherInfoBean(userOtherInfoBean);
		
		UserAddressBean tempAddressInfo =new UserAddressBean();
		tempAddressInfo.setHouseNo(11);
		tempAddressInfo.setCity("udupi");
		tempAddressInfo.setStreet("Athrdi");
		tempAddressInfo.setAddressType('t');
		
		UserAddressBean permanetAddrees =new UserAddressBean();
		permanetAddrees.setHouseNo(11);
		permanetAddrees.setCity("udupi");
		permanetAddrees.setStreet("Athrdi");
		permanetAddrees.setAddressType('p');
	
		List<UserAddressBean> userAddressList = new ArrayList();
		userAddressList.add(permanetAddrees);
		userAddressList.add(tempAddressInfo);
		
		userInfo.setUserAddressList(userAddressList);
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writerWithDefaultPrettyPrinter();
			mapper.writeValue(new File("userJson3.json"), userInfo);
			mapper.writeValue(System.out, userInfo);
			
			
			
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

