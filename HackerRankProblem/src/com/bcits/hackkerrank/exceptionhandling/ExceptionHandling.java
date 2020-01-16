package com.bcits.hackkerrank.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value of x:");
			int x = sc.nextInt();
			System.out.println("Enter the value of y:");
			int y = sc.nextInt();
			int z = x / y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} finally {
			sc.close();
		}
	}
}