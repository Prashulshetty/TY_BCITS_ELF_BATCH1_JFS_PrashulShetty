package com.bcits.springrestjaxb.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.bcits.springrestjaxb.bean.UserAddressBean;
import com.bcits.springrestjaxb.bean.UserInfoBean;
import com.bcits.springrestjaxb.bean.UserOtherInfoBean;


public class UserMarshallingTest {

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
			JAXBContext context = JAXBContext.newInstance(UserInfoBean.class);
			Marshaller marshaller =context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(userInfo, System.out);
			marshaller.marshal(userInfo, new File("userInfo2.xml"));
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
