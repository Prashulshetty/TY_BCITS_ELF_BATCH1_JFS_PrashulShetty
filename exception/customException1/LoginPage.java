package com.bcits.exception;

import java.util.Scanner;

public class LoginPage {
	
	Scanner s2 = new Scanner(System.in);
	public int login(long MobileNo) {
		if (MobileNo == 9901348957L ) {
			System.out.println("click next");
			return 1;
		} else { 
			System.out.println("Mobile Number is not registered..");
			return 0;
		}
	}
	public void next() throws CustomException {
		System.out.println("Enter a 6 digit OTP sent your registered Mobile number : ");
		int OTP =s2.nextInt();
		if (OTP==666333) {
		System.out.println("login successful...");	
		} else {
			throw new CustomException(" Invalid OTP ");
		}
	}

}
