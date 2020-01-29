package com.bcits.usecase.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.bcits.usecase.beans.ConsumerMaster;

@Repository
public class CustomerDAOImp implements CustomerDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory ;
	
	@Override
	public boolean addConsumer(ConsumerMaster conInfoBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(conInfoBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;
	}

}