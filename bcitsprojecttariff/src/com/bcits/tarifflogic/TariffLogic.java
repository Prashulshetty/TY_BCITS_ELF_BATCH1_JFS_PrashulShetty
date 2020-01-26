package com.bcits.tarifflogic;

import java.util.Scanner;

public class TariffLogic {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.err.println("Welcome to DISCOM");
		System.out.println("------------------------");
		home();
	}
	
	public static void home() {
		System.out.println("\nselect the option: ");
		System.out.println("1.Employee login..");
		System.out.println("2.Consumer login..");
		System.out.println("3.logout..");
		int option = Integer.parseInt(sc.nextLine());	
      switch (option) {
	case 1:
		EmployeeLogin.employeeLogin();
	     home();
		
		break;
	case 2:
		
		System.out.println("Enter rrNumber : ");
		int num = Integer.parseInt(sc.nextLine());
		int details = Consumer.showBill(num);
		if(details==0) {
			System.out.println("This month bill is not generated...");
			home();	
		} else {
			home();
		}
		
		break;
	case 3:
		System.err.println("logged out....!!!");
	    home();
		
	default:
		break;
	}
		}
	}

