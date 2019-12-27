package com.bcits.trywithmultiplecatch;

public class NestedTry {

	public static void main(String[] args) {
		String name= null;
		System.out.println("main started");
try {
	try { 
	System.out.println(name.length());
}  catch ( NullPointerException  e) {
			System.out.println(e.getMessage());
}
	System.out.println(10/0);
	
	
} catch (ArithmeticException   e) {
	System.out.println(e.getMessage());
	
}
System.out.println("main ended");
}


	}


