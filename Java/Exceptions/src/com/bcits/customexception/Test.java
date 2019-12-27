package com.bcits.customexception;

public class Test {

	public static void main(String[] args) {
		 System.out.println("main started");
		 Election e = new Election();
		 try {
			e.vote(12);
		} catch (AgeLimtException a) {
			System.out.println(a.getmsg());
		}
System.out.println("mainended");
	}

}
