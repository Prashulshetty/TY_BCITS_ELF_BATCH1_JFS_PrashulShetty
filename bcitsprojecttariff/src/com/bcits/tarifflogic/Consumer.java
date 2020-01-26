package com.bcits.tarifflogic;

import java.util.Iterator;
import java.util.Set;

public class Consumer {
 static	int  details=0;
	public static int showBill(int num) {
		
		Set keys = ConsumerBill.map.keySet();
		Iterator itr = keys.iterator();
		
		while (itr.hasNext()) {
			ConsumerDetails consumer = ConsumerBill.map.get(itr.next());
			if(consumer.getRrNumber() == num) {
			System.out.println("----------Bill---------------");
			System.out.println("Name          : " + consumer.getConsumerName());
			System.out.println("rrNumber      : " + consumer.getRrNumber());
			System.out.println("Consumer Type : " + consumer.getTypeOfConsumer());
			System.out.println("bill          : " + consumer.getBill());
			System.out.println();
			System.out.println("------------------------------");
			 details++;
		}
		}
		return details;
	}
	
}
