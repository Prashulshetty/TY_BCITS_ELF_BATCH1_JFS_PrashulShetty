package com.bcits.usecase.dao;

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
import com.bcits.usecase.beans.AdminBean;
import com.bcits.usecase.beans.ConsumerMasterBean;
import com.bcits.usecase.beans.CurrentBillBean;



@Repository
public class EmployeeDAOImp implements EmployeeDAO{

	@PersistenceUnit
	EntityManagerFactory factory ;
	
	@Autowired
	private BillCalculation calculation;
	@Override
	public EmployeeMasterBean employeeLogin(int empId, String password) {
			EntityManager manager = factory.createEntityManager();
			EmployeeMasterBean empInfo = manager.find(EmployeeMasterBean.class, empId);
			if(empInfo != null && empInfo.getPassword().equals(password)) {
				return empInfo;
			}
			return null;

	}

	@Override
	public AdminBean adminLogin(int adminId, String password) {
		EntityManager manager = factory.createEntityManager();
		AdminBean adminInfo = manager.find(AdminBean.class, adminId);
		if(adminInfo != null && adminInfo.getPassword().equals(password)) {
			return adminInfo;
		}
		return null;
	}

	@Override
	public long numberOfConsumer(String region) {
			EntityManager manager =factory.createEntityManager();
			String jpql ="select count(*) from ConsumerMasterBean where region= :region ";
			Query query =manager.createQuery(jpql);
			query.setParameter("region", region);
			long number = (long) query.getSingleResult();
			if(number != 0) {
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
	}//end 

	@Override
	public List<ConsumerMasterBean> showAllConsumer(String region) {
		EntityManager manager = factory.createEntityManager();
		String jpql = " from ConsumerMasterBean where region= :reg ";
		Query query =manager.createQuery(jpql);
		query.setParameter("reg", region);
		List<ConsumerMasterBean> consumerList = (List<ConsumerMasterBean>) query.getResultList();
		System.out.println(consumerList);
		if(consumerList != null) {
			return consumerList;
		}
		return null;
	}
	

	@Override
	public boolean addCurrentBill(CurrentBillBean currentBill) {
		
			double units =currentBill.getCurrentReading()-currentBill.getInitialReading();
			EntityManager manager =factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			MonthlyConsumption monthlyConsumption = new MonthlyConsumption();
			MonthlyConsumptionPK monthlyPK = new MonthlyConsumptionPK();
			CurrentBillBean bill = manager.find(CurrentBillBean.class, currentBill.getRrNumber());
		
			System.out.println(units);
			System.out.println(currentBill.getTypeOfConsumer());
			 double billAmount = calculation.calculateBill(units, currentBill.getTypeOfConsumer());
			try {
				transaction.begin();
			if(bill != null  ) {
				manager.remove(bill);
			}
			monthlyConsumption.setBillAmount(billAmount);
				monthlyConsumption.setStatus("Not Paid");
				monthlyConsumption.setPreviousReading(currentBill.getInitialReading());
				monthlyConsumption.setCurrentReading(currentBill.getCurrentReading());
				monthlyConsumption.setUnits(units);
				monthlyPK.setDate(new Date());
				monthlyPK.setRrNumber(currentBill.getRrNumber());
				monthlyConsumption.setConsumptionPk(monthlyPK);
				currentBill.setBillAmount(billAmount);
				currentBill.setUnits(units);
				manager.persist(monthlyConsumption);
				manager.persist(currentBill);
				transaction.commit();
				return true;
			} catch (Exception e) {
			
			return false;
		}

	}
}

