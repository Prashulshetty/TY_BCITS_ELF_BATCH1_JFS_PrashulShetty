package com.bcits.tarifflogic;

import java.util.HashMap;
import java.util.Scanner;

public class ConsumerBill {

	static long initailReading;
	static long finalReading;
	static double bill;

	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer, ConsumerDetails> map = new HashMap<Integer, ConsumerDetails>();

	public static void consumerbill() {

		System.out.println("Enter Consumer Name ");
		String name = sc.nextLine();
		int id = 0;
		try {
			System.out.println("Enter the Id ");
			id = Integer.parseInt(sc.nextLine());
			if (id > 0) {
				System.out.println("Enter the initial reading ");
				initailReading = Integer.parseInt(sc.nextLine());
				if (initailReading >= 0) {
					System.out.println("Enter the final reading");
					finalReading = Integer.parseInt(sc.nextLine());
					if (finalReading < initailReading) {
						System.out.println("Final Reading must be Initial Reading...!");
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Enter valid id/readings");
		}

		System.out.println("Select the type of Consumer");
		System.out.println("1.Residential consumers");
		System.out.println("2.Commercial consumers");
		System.out.println("3.Industries consumer");

		switch (Integer.parseInt(sc.nextLine())) {
		case 1:
			bill = BillCalculation.residential(initailReading, finalReading);
			ConsumerDetails user1 = new ConsumerDetails(name, id, "RESIDENTIAL", bill);
			System.out.println("bill = " + bill);
			System.out.println(".................................");
			map.put(id, user1);
			break;
		case 2:
			bill = BillCalculation.commercial(initailReading, finalReading);
			ConsumerDetails user2 = new ConsumerDetails(name, id, "COMMERECIAL", bill);
			System.out.println("bill = " + bill);
			System.out.println(".................................");
			map.put(200, user2);
			break;
		case 3:
			bill = BillCalculation.industry(initailReading, finalReading);
			ConsumerDetails user3 = new ConsumerDetails(name, id, "INDUSTRY", bill);
			System.out.println("bill = " + bill);
			System.out.println(".................................");
			map.put(300, user3);
			break;
		default:
			System.err.println("Select valid option..!");
		}
	}

}
