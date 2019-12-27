package com.bcits.trywithmultiplecatch;

public class TryMultipleCatch1 {

	public static void main(String[] args) {
		String name= null;
			System.out.println("main started");
	try {
		System.out.println(name.length());
		System.out.println(10/0);
		
		
	} catch (ArithmeticException | NullPointerException  e) {
		System.out.println(e.getMessage());
		//} catch (NullPointerException n) {
	   //	System.out.println(n.getMessage());
	}
	System.out.println("main ended");
	}

}
