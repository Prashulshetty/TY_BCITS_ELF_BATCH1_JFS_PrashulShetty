package com.bcits.springrest.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.springrest.bean.EmployeeInfoBean;





@Repository
public class EmployeeImplementation implements EmployeeDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory ;
	
	//@PersistenceContext
	//private EntityManager manager;

	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
			isAdded=false;
		}
		return isAdded;
	}

	
	@Override
	public boolean deletEmployee(int empId) {
		boolean isDeleted =false;
		EntityManager manager = factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		if (employeeInfoBean != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
		manager.remove(employeeInfoBean);
		transaction.commit();
		isDeleted=true;
		}
		return isDeleted;
	}

	
	@Override
	public boolean updateEmployee(EmployeeInfoBean bean) {
	
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Integer empId = bean.getEmpId();
		String empName =bean.getName();
		Double salary = bean.getSalary();
		Long mobileNum = bean.getMobileNum();
		String designation =bean.getDesignation();
		Date birthDate =bean.getBirthDate();
		Date joiningDate =bean.getJoiningDate();
		String maildId =bean.getMaildId();
		String password =bean.getPassword();
		String bloodGroup =bean.getBloodGroup();
		Integer deptId =bean.getDeptId();
		Integer mgrId =bean.getMgrId();		
				
		
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		if (employeeInfoBean != null) {
			try {
				transaction.begin();
				
				
				if (empName != null) {
					employeeInfoBean.setName(empName);
				}
				if (salary != null && salary > 0) {
					employeeInfoBean.setSalary(salary);
				}
				if (designation != null) {
					employeeInfoBean.setDesignation(designation);
				}
				if (mobileNum != null) {
					employeeInfoBean.setMobileNum(mobileNum);
				}
				if (joiningDate != null) {
					employeeInfoBean.setJoiningDate(joiningDate);
				}
				if (birthDate != null) {
					employeeInfoBean.setBirthDate(birthDate);
				}
				if (bloodGroup != null) {
					employeeInfoBean.setBloodGroup(bloodGroup);
				}
				if (deptId != null) {
					employeeInfoBean.setDeptId(deptId);
				}
				if (!maildId.isEmpty()) {
					employeeInfoBean.setMaildId(maildId);
				}
				if (mgrId != null) {
					employeeInfoBean.setMgrId(mgrId);
				}
				if (!password.isEmpty()) {
					employeeInfoBean.setPassword(password);
				}
				
				transaction.commit();
				return true;

			} catch (Exception e) {
				e.printStackTrace();
			} 
				  finally { manager.close(); }
				 
		}
		return false;
	}

	
	@Override
	public EmployeeInfoBean getEmployee(int empId) {
		EntityManager manager = factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		return employeeInfoBean;
	}

	
	@Override
	public List<EmployeeInfoBean> getAllEmployee() {
  EntityManager manager = factory.createEntityManager();	
		
		String jpql = " from EmployeeInfoBean ";
		Query query =manager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List <EmployeeInfoBean> list=query.getResultList();
		manager.close();
		return list;
	}


	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager manager = factory.createEntityManager();	
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		if(employeeInfoBean != null && employeeInfoBean.getPassword().equals(password)) {
			return employeeInfoBean;
		} else {
		return null;
	}
	
	}
	
}
