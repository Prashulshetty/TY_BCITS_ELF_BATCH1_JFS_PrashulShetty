package com.bcits.usecase.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.bcits.usecase.beans.TariffMaster;

@Repository
public class BillCalculation {

	@PersistenceUnit
	private EntityManagerFactory factory;

	public double calculateBill(double units, String typeOfConsumer) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from TariffMaster where type = :consumerType ";
		Query query = manager.createQuery(jpql);
		query.setParameter("consumerType", typeOfConsumer);
		List<TariffMaster> tariff = query.getResultList();

		long initialRange = tariff.get(0).getTarriffpk().getRange();
		long midRange = tariff.get(1).getTarriffpk().getRange();
		long finalRange = tariff.get(2).getTarriffpk().getRange();

		double initialAmount = tariff.get(0).getAmount();
		double midAmount = tariff.get(1).getAmount();
		double finalAmount = tariff.get(2).getAmount();

		double bill = 0.0;
		if (units < initialRange) {
			bill = units * initialAmount;
		} else if (units < midRange) {
			bill = (initialRange * initialAmount) + ((units - initialRange) * midAmount);
		} else if (units > finalRange) {
			bill = (initialRange * initialAmount) + ((midRange - initialRange) * midAmount) + ((units - midRange));
		}
		return bill;
	} // end of calculateBill

} // end of BillCalculation
