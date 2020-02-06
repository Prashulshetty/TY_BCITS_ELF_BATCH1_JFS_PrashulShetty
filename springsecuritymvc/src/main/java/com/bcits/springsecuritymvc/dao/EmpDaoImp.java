package com.bcits.springsecuritymvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.springsecuritymvc.beans.EmpInfoBean;

@Repository
public class EmpDaoImp implements EmpDao {
	
@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean register(EmpInfoBean empInfoBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		
		boolean isRegistered = false;
		try {
			tx.begin();
			manager.persist(empInfoBean);
			tx.commit();
			isRegistered=true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.clear();
		}
		
		return isRegistered;
	}

	@Override
	public EmpInfoBean getEmployee(int empId) {
		EntityManager manager = factory.createEntityManager();
		EmpInfoBean empInfo = manager.find(EmpInfoBean.class, empId);
		manager.close();
		return empInfo;
	}

	@Override
	public List<EmpInfoBean> getAllEmployees() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from EmpInfoBean") ;
		List<EmpInfoBean> employeeList = query.getResultList();
		manager.close();
		return employeeList;
	}

}
