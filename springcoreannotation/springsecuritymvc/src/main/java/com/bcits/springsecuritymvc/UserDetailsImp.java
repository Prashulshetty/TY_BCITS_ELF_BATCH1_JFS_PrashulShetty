package com.bcits.springsecuritymvc;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Component
public class UserDetailsImp implements UserDetails{
	
	private EmpInfoBean empInfoBean;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(empInfoBean.getRole());
		return Arrays.asList(authority);
		
	}

	@Override
	public String getPassword() {
		
		return empInfoBean.getPassword();
	}

	@Override
	public String getUsername() {
		
		return empInfoBean.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
