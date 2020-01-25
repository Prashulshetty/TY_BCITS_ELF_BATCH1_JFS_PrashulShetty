package com.bcits.springmvc.container;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.springmvc.beans.EmployeeInfoBean;

@Repository
public class EmployeeImplementation implements EmployeeDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory ;

	@Override
	public boolean addEmployee(EmployeeInfoBean bean) {
		//EntityManagerFactory emf = (EntityManagerFactory) EntityManagerDAOFactory.getDAOInstance();
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
		
		String jpql = " from PrimaryInfo ";
		Query query =manager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List <EmployeeInfoBean> list=query.getResultList();
		manager.close();
		return null;
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
