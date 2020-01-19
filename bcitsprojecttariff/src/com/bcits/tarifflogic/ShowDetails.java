package com.bcits.tarifflogic;

import java.util.Iterator;
import java.util.Set;

public class ShowDetails {
 static	int  details=0;
	public static int show() {
		System.out.println("----------DETAILS---------------");
		Set keys = ConsumerBill.map.keySet();
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			ConsumerDetails consumer = ConsumerBill.map.get(itr.next());
			System.out.println("Name : " + consumer.getConsumerName());
			System.out.println("ID   : " + consumer.getConsumerId());
			System.out.println("type : " + consumer.getTypeOfConsumer());
			System.out.println("bill : " + consumer.getBill());
			System.out.println();
			System.out.println("------------------------------");
			 details++;
		}
		
		return details;
	}
	
}
