package com.bcits.exception;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
				System.out.println("Enter the user name:");
	            String user =s.nextLine();
	            System.out.println("Enter the password:");
	           int password = s.nextInt();
	           LoginPage user1= new LoginPage();
	           try {
				user1.login(user, password);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
	}        
}
