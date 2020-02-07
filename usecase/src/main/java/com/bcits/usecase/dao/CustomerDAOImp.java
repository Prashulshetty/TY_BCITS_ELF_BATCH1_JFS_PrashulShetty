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
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.beans.QueryMsgBeanPK;

@Repository
public class CustomerDAOImp implements CustomerDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

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
	}// end of consumerSignUp method

	@Override
	public ConsumerMasterBean consumerLogin(String email, String password) {
		ConsumerMasterBean info = null;
		try {
			EntityManager manager = factory.createEntityManager();
			Query query = manager.createQuery(" from ConsumerMasterBean where email= :email ");
			query.setParameter("email", email);
			ConsumerMasterBean InfoBean = (ConsumerMasterBean) query.getSingleResult();
			if (InfoBean != null && InfoBean.getPassword().equals(password)) {
				info = InfoBean;
			}
		} catch (Exception e) {

		}
		return info;
	}

	@Override
	public CurrentBillBean showCurrentBill(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		CurrentBillBean bill = manager.find(CurrentBillBean.class, rrNumber);
		System.out.println(bill);
		if (bill != null) {
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
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = " from MonthlyConsumption where rrNumber=:rrNumber order by currentReading desc";
		Query query = manager.createQuery(jpql);
		query.setMaxResults(1);
		query.setParameter("rrNumber", rrNumber);
		MonthlyConsumption monthlyConsumption = (MonthlyConsumption) query.getSingleResult();
		BillHistoryBean billHistory = new BillHistoryBean();
		BillHistoryPK billHistoryPk = new BillHistoryPK();
		billHistory.setBillAmount(billamount);
		billHistory.setStatus("paid");
		billHistoryPk.setRrNumber(rrNumber);
		billHistoryPk.setDateOfPayment(date);
		billHistory.setHistory(billHistoryPk);

		if (billHistoryPk != null) {
			transaction.begin();
			monthlyConsumption.setStatus("paid");
			manager.persist(billHistory);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public ConsumerMasterBean getCustomer(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		ConsumerMasterBean consumerInfo = manager.find(ConsumerMasterBean.class, rrNumber);
		if (consumerInfo != null) {
			return consumerInfo;
		}
		manager.close();
		return null;
	}

	@Override
	public double getPreviousReading(String rrNumber) {
		EntityManager manager = factory.createEntityManager();
		double previous = 0.0;
		try {
			String jpql = " select currentReading from MonthlyConsumption where rrNumber =: number order by currentReading DESC ";
			Query query = manager.createQuery(jpql);
			System.out.println(query);
			query.setMaxResults(1);
			System.out.println(rrNumber);
			query.setParameter("number", rrNumber);
			previous = (double) query.getSingleResult();
		} catch (Exception e) {
			return 00;
		}
		if (previous != 0) {
			return previous;
		}
		return 00;
	}

	
	@Override
	public List<MonthlyConsumption> getAllBills(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql = " from MonthlyConsumption where region = :reg ";
		Query query = manager.createQuery(jpql);
		query.setParameter("reg", region);
		List<MonthlyConsumption> billLists = query.getResultList();
		System.out.println(billLists);
		if (billLists != null) {
			return billLists;
		}
		manager.close();
		return null;

	}

	@Override
	public boolean queryMsg(String query, String rrNumber, String region) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		QueryMsgBean msgBean = new QueryMsgBean();
		QueryMsgBeanPK msgBeanPK = new QueryMsgBeanPK();
		try {
			transaction.begin();
			msgBean.setRegion(region);
			msgBeanPK.setRrNumber(rrNumber);
			msgBean.setQueryRequest(query);
			msgBeanPK.setDate(new Date());
			msgBean.setMsgPk(msgBeanPK);
			manager.persist(msgBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}