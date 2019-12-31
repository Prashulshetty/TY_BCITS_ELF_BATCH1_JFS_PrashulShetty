package com.bcits.hackkerrank.generics;

public class Generics1 {

	public <inputType> void print(inputType[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
	Generics1 myPrinter = new Generics1();
    Integer[] intArray = { 1, 2, 3 };
    String[] stringArray = {"Hello", "World"};
    myPrinter.print(intArray);
    myPrinter.print(stringArray);
}
}
