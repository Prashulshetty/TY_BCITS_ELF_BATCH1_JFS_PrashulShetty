package com.bcits.checkedexception;

public class Calculator1 {
	
	void division(int a,int b)
	{
		try {
			Class.forName("Person");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
	}

}

