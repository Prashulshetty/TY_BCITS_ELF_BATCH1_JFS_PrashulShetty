package com.bcits.usecase.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcits.usecase.beans.EmployeeMasterBean;
import com.bcits.usecase.beans.MonthlyConsumption;
import com.bcits.usecase.beans.MonthlyConsumptionPK;
import com.bcits.usecase.beans.QueryMsgBean;
import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Autowired
	private BillCalculation calculation;

	@Override
	public EmployeeMasterBean employeeLogin(int empId, String password) {
		EntityManager manager = factory.createEntityManager();
		EmployeeMasterBean empInfo = manager.find(EmployeeMasterBean.class, empId);
		if (empInfo != null && empInfo.getPassword().equals(password)) {
			return empInfo;
		}
		return null;

	}

	@Override
	public AdminBean adminLogin(int adminId, String password) {
		EntityManager manager = factory.createEntityManager();
		AdminBean adminInfo = manager.find(AdminBean.class, adminId);
		if (adminInfo != null && adminInfo.getPassword().equals(password)) {
			return adminInfo;
		}
		return null;
	}

	@Override
	public long numberOfConsumer(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select count(*) from ConsumerMasterBean where region= :region ";
		Query query = manager.createQuery(jpql);
		query.setParameter("region", region);
		long number = (long) query.getSingleResult();
		if (number != 0) {
			return number;
		}
		return 0;
	}


	
	
	@Override
	public boolean addEmp(EmployeeMasterBean employeeBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;
		try {
			transaction.begin();
			manager.persist(employeeBean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isAdded;
	}// end
	
	@Override
	public boolean deleteEmp(int empId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isDeleted = false;
		try {
			transaction.begin();
			EmployeeMasterBean info = manager.find(EmployeeMasterBean.class,empId);
			if (info != null) {
				manager.remove(info);

				transaction.commit();

				isDeleted = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isDeleted;
	}
	@Override
	public List<ConsumerMasterBean> showAllConsumer(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql = " from ConsumerMasterBean where region= :reg ";
		Query query = manager.createQuery(jpql);
		query.setParameter("reg", region);
		List<ConsumerMasterBean> consumerList = (List<ConsumerMasterBean>) query.getResultList();
		System.out.println(consumerList);
		if (consumerList != null) {
			return consumerList;
		}
		return null;
	}

	
	@Override
	public CurrentBillBean addCurrentBill(CurrentBillBean currentBill,String region) {

		double units = currentBill.getCurrentReading() - currentBill.getInitialReading();
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		MonthlyConsumption monthlyConsumption = new MonthlyConsumption();
		MonthlyConsumptionPK monthlyPK = new MonthlyConsumptionPK();
		CurrentBillBean bill = manager.find(CurrentBillBean.class, currentBill.getRrNumber());
		if(bill != null) {
			Calendar cal = Calendar.getInstance();
		  	cal.setTime(new Date());
		  	Calendar cal1 = Calendar.getInstance();
		  	cal1.setTime(bill.getDate());
		  	if(cal.get(Calendar.MONTH) == cal1.get(Calendar.MONTH)) {
		  		return null;
		  	}
		}
		ConsumerMasterBean consumerBean = manager.find(ConsumerMasterBean.class, currentBill.getRrNumber());
		double billAmount = calculation.calculateBill(units, currentBill.getTypeOfConsumer());
		try {
			transaction.begin();
			if (bill != null) {
				manager.remove(bill);
			}
			monthlyConsumption.setBillAmount(billAmount);
			monthlyConsumption.setStatus("Not Paid");
			monthlyConsumption.setInitialReading(currentBill.getInitialReading());
			monthlyConsumption.setCurrentReading(currentBill.getCurrentReading());
			monthlyConsumption.setRegion(consumerBean.getRegion());
			monthlyConsumption.setUnits(units);
			monthlyConsumption.setConsumptionPk(monthlyPK);
			monthlyPK.setDate(new Date());
			monthlyPK.setRrNumber(currentBill.getRrNumber());
			monthlyConsumption.setConsumptionPk(monthlyPK);
			currentBill.setBillAmount(billAmount);
			currentBill.setUnits(units);
			currentBill.setDate(new Date());
			manager.persist(monthlyConsumption);
			manager.persist(currentBill);
			transaction.commit();
			return currentBill;
		} catch (Exception e) {

			return null;
		}

	}

	@Override
	public boolean sendRespond(String rrNumber, String queryResponse, Date date) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = " from QueryMsgBean where msgPk.rrNumber= :num and DATE(msgPk.date)=:date ";
			Query query = manager.createQuery(jpql);
			query.setParameter("num", rrNumber);
			query.setParameter("date", date);
			QueryMsgBean queryBean = (QueryMsgBean) query.getSingleResult();
			queryBean.setQueryResponse(queryResponse);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public List<QueryMsgBean> getQueryList(String region) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = " from QueryMsgBean where region = :region ";
			Query queries = manager.createQuery(jpql);
			queries.setParameter("region", region);
			List<QueryMsgBean> queryList = queries.getResultList();
			if (queryList == null && queryList.isEmpty()) {
				return null;
			}
			return queryList;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean updatePassword(String password, int empId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isUpdated = false;
		try {
			transaction.begin();
			EmployeeMasterBean info = manager.find(EmployeeMasterBean.class,empId);
			if (info != null) {
				info.setPassword(password);

				transaction.commit();

				isUpdated = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return isUpdated;
	}

	@Override
	public List<Object[]> getPaidBills(String region) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = " select sum(billAmount), DATE_FORMAT(consumptionPk.date,'%Y-%m') from MonthlyConsumption "
					+ " where region=:region and status='paid' GROUP BY MONTH(consumptionPk.date) ";
			Query query = manager.createQuery(jpql);
			query.setParameter("region", region);
			List<Object[]> paid = query.getResultList();
			return paid;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
