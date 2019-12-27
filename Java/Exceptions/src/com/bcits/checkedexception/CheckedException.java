package com.bcits.checkedexception;

public class CheckedException {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.clone();
			System.out.println("object is cloned");
			
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			
		}
		

	}

}
