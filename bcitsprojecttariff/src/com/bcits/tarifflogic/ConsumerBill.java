package com.bcits.tarifflogic;

import java.util.HashMap;
import java.util.Scanner;

public class ConsumerBill {

	static long initailReading;
	static long finalReading;
	static double billAmount;

	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer, ConsumerDetails> map = new HashMap<Integer, ConsumerDetails>();

	public static void consumerbill() {

		System.out.println("Enter Consumer Name :  ");
		String name = sc.nextLine();
		
		int rrNumber = 0;
		
		try {
			
			System.out.println("Enter the rrNumber : ");
			rrNumber = Integer.parseInt(sc.nextLine());
			if (rrNumber > 0) {
				System.out.println("Enter the initial reading : ");
				initailReading = Integer.parseInt(sc.nextLine());
				if (initailReading >= 0) {
					System.out.println("Enter the final reading : ");
					finalReading = Integer.parseInt(sc.nextLine());
					if (finalReading > initailReading) {
						
						System.out.println("Select the type of Consumer");
						System.out.println("1.Residential consumers");
						System.out.println("2.Commercial consumers");
						System.out.println("3.Industries consumer");

						switch (Integer.parseInt(sc.nextLine())) {
						case 1:
							billAmount = BillCalculation.residential(initailReading, finalReading);
							ConsumerDetails user1 = new ConsumerDetails(name, rrNumber, "RESIDENTIAL", billAmount);
							System.err.println("Bill Amount = " + billAmount);
							System.out.println(".................................");
							map.put(rrNumber, user1);
							break;
						case 2:
							billAmount = BillCalculation.commercial(initailReading, finalReading);
							ConsumerDetails user2 = new ConsumerDetails(name, rrNumber, "COMMERECIAL", billAmount);
							System.err.println("Bill Amount = " + billAmount);
							System.out.println(".................................");
							map.put(rrNumber, user2);
							break;
						case 3:
							billAmount = BillCalculation.industry(initailReading, finalReading);
							ConsumerDetails user3 = new ConsumerDetails(name, rrNumber, "INDUSTRY", billAmount);
							System.err.println("Bill Amount = " + billAmount);
							System.out.println(".................................");
							map.put(rrNumber, user3);
							break;
						default:
							System.err.println("Select valid option..!");
							consumerbill();
						}
							
						
					
					} else {
						System.err.println("Final Reading must be greater than Initial Reading...!");
						consumerbill();		
					}
				} else {
					System.err.println("Initial Reading must be greater than  Zero...!");
					consumerbill();	
					
				}
			} else {
				System.err.println("rrNumber should be non-negative...!");
				consumerbill();	
				
			}
		} catch (Exception e) {
			System.err.println("Enter valid id/readings");
			consumerbill();
			
		}

		
	}

}

