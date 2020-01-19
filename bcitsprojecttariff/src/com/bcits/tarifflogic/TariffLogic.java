package com.bcits.tarifflogic;

import java.util.Scanner;

public class TariffLogic {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.err.println("Welcome to DISCOME\n") ;
		employeeLogin();
		}
		
		public static void employeeLogin() {
		System.out.println("Enter the Employee Name : ");
		String eName = sc.nextLine();
		
		System.out.println("Enter the Password : ");
		String ePassword = (sc.nextLine());
		
		if(((ePassword.equals("discom123")) & (eName.equals("Nagesh"))) || ((ePassword.equals("discom321")) & (eName.equals("Ramesh")))){		
			while (true) {
				System.out.println("select an option..");
				System.out.println("1.show Consumer details");
				System.out.println("2.Generate Current month Bill");

				int option = Integer.parseInt(sc.nextLine());
				switch (option) {

				case 1:
					int records = ShowDetails.show();
					if (records == 0) {
						System.err.println("First generate the bill and see consumer details...!!");
					}
					break;

				case 2:

					ConsumerBill.consumerbill();

					break;

				default:
					System.err.println("Select  valid Option..");
					
				}

			}

		} else {
			System.err.println("Please Enter valid Employee ID and Password...!");
			System.out.println();
			employeeLogin();

		}

	}
		
}