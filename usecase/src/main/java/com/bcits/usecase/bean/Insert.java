package com.bcits.usecase.bean;





import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Insert {
	public static void main(String[] args) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		ConsumerMaster primary = new ConsumerMaster();
		primary.setFirstName("aaa");
		

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bcitsPeristenceUnit");
			manager = entityManagerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(primary);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
	}
}
