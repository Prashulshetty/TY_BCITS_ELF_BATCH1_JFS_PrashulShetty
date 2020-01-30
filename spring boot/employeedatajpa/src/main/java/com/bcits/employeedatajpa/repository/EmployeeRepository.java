package com.bcits.employeedatajpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bcits.employeedatajpa.beans.EmployeeInfoBean;
 
public interface EmployeeRepository  extends CrudRepository<EmployeeInfoBean, Integer> {

	@Query(" from EmployeeInfoBean where emp_id = :id and password = :pwd ")
	public EmployeeInfoBean getEmployee(int id,@Param("pwd") String Password);
}
