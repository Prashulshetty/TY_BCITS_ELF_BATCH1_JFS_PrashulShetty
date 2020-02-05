package com.bcits.usecase.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bcits.usecase.beans.BillHistoryBean;
import com.bcits.usecase.beans.BillHistoryPK;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;
import com.bcits.usecase.beans.MonthlyConsumption;





@Repository
public class CustomerDAOImp implements CustomerDAO {
	
	@PersistenceUnit
	EntityManagerFactory factory ;
	
	@Override
	public boolean consumerSignUp(ConsumerMasterBean consumerBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(consumerBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}//end of consumerSignUp method

	@Override
	public ConsumerMasterBean consumerLogin(String email, String password) {
		ConsumerMasterBean info=null;
		try {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(" from ConsumerMasterBean where email= :email ");
		query.setParameter("email",email);
		ConsumerMasterBean InfoBean = (ConsumerMasterBean) query.getSingleResult();
		if(InfoBean != null && InfoBean.getPassword().equals(password)) {
			info =  InfoBean;
		}
		} catch (Exception e) {

	}
		return info;
	}	
	

	@Override
	public CurrentBillBean generateCurrentBill(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		CurrentBillBean bill = manager.find(CurrentBillBean.class, rrNumber);
		System.out.println(bill);
		if(bill != null) {
			return bill;
		}
		return null;
	}
		
	

	@Override
	public List<BillHistoryBean> showBillHistory(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(" from BillHistoryBean where rrNumber= :rrNum ");
		query.setParameter("rrNum", rrNumber);
		List<BillHistoryBean> history = query.getResultList();
		if (history != null) {
			return history;
		}
		manager.close();
		return null;
	}

	@Override
	public List<MonthlyConsumption> getMonthlyConsumptions(String rrNumber) {
		
			EntityManager manager = factory.createEntityManager();
			Query query = manager.createQuery(" from MonthlyConsumption where rrNumber= :rrNum ");
			query.setParameter("rrNum", rrNumber);
			List<MonthlyConsumption> billList = query.getResultList();
			if (billList != null) {
				return billList;
			}
			manager.close();
			return null;
		
	}

	@Override
	public boolean payment(String rrNumber, Date date, int billamount) {
		System.out.println(date);
		System.out.println(rrNumber);
		System.out.println(billamount);
		boolean paid=false;
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			BillHistoryBean billHistory = new BillHistoryBean();
			BillHistoryPK billHistoryPk = new BillHistoryPK();
			billHistory.setBillAmount(billamount);
			billHistory.setStatus("paid");
            billHistoryPk.setRrNumber(rrNumber);
            billHistoryPk.setDateOfPayment(date);
            billHistory.setHistory(billHistoryPk);
         
			System.out.println(billHistoryPk);
			System.out.println(billHistory);
			
			try {
				if (billHistoryPk != null) {
					transaction.begin();
					manager.persist(billHistory);
					transaction.commit();
					paid = true;
				} 
			} catch (Exception e) {
				paid = false;
			}
			return paid;
	}

	@Override
	public ConsumerMasterBean getCustomer(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		ConsumerMasterBean consumerInfo = manager.find(ConsumerMasterBean.class, rrNumber);
		if(consumerInfo != null) {
			return consumerInfo;
		}
		manager.close();
		return null;
	}
	

	@Override
	public long getPreviousReading(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		long previous;
		try {
		String jpql =" select currentReading from MonthlyConsumption where rrNumber=:rrNum order by currentReading DESC";
		Query query = manager.createQuery(jpql);
		query.setMaxResults(1);
		query.setParameter("rrNum", rrNumber);
		previous = (long) query.getSingleResult();
		}catch (Exception e) {
			return 0;
		}
		if(previous != 0) {
			return previous;
		}
		return 0;
	}
	}
