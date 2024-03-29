package com.bcits.springsecuritymvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.bcits.springsecuritymvc.dao.EmpDao;
@Component
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private EmpDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetailsImp userDetailsImp = new UserDetailsImp();
		userDetailsImp.setEmpInfoBean(dao.getEmployee(Integer.parseInt(username)));
		return userDetailsImp;
	}

}
