package com.bcits.jpawithhibernatejpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {

	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager manager =null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
			 manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String jpql = " update EmployeePrimaryInfo set emp_name=:en where emp_id=:id ";
			Query query=manager.createQuery(jpql);
			query.setParameter("id", 10);
			query.setParameter("en", "Shetty");
			int count =query.executeUpdate();
			System.out.println(" Number of rows affected==="+count);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
		manager.close();
	}
	}
}
