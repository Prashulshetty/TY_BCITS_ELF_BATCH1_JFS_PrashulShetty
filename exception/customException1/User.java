package com.bcits.exception;

import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your registered Mobile number:");
		long MobileNo =s1.nextLong();
		LoginPage user1 = new LoginPage();
		int t =user1.login(MobileNo);
		if(t==1) {
		try {
			user1.next() ;
		} catch (CustomException e) { 
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	  }
	} 
}


