package com.bcits.tarifflogic;

import java.util.Scanner;

public class EmployeeLogin {
	static Scanner sc = new Scanner(System.in);

	public static void employeeLogin() {
		System.out.println("Enter the Employee Name : ");
		String eName = sc.nextLine();

		System.out.println("Enter the Password : ");
		String ePassword = (sc.nextLine());

		if (((ePassword.equals("discom123")) & (eName.equals("Nagesh")))
				|| ((ePassword.equals("discom321")) & (eName.equals("Ramesh")))) {
			while (true) {
				System.out.println("select an option..");
				System.out.println("1.show Consumer bill details");
				System.out.println("2.Generate Current month Bill");
				System.out.println("3.Logout");

				int option = Integer.parseInt(sc.nextLine());
				switch (option) {

				case 1:
					int records = ShowDetails.show();
					if (records == 0) {
						System.err.println("No bill records found for display...");

					}
					break;

				case 2:

					ConsumerBill.consumerbill();

					break;
				case 3:
					System.err.println("logged out....!!!");
					TariffLogic.home();
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
