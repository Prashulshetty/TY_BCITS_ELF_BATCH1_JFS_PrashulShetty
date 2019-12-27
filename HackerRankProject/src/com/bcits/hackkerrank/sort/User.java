package com.bcits.hackkerrank.sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class User {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the total number of Student..");
		int number = Integer.parseInt(sc.nextLine());
		ArrayList<Student> list = new ArrayList<Student>(number);
		for (int i = 1; i <= number ; i++) {
			System.out.println("Enter the id of "+i +" student: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the name of "+i +" student: ");
			String name = (sc.nextLine());
			System.out.println("Enter the cgpa of "+i +" student: ");
			double cgpa = Double.parseDouble(sc.nextLine());
			
			Student s = new Student(id,name,cgpa);
			list.add(s);
		}
		System.out.println(list);
		
		SortStudent ss = new SortStudent();
		Collections.sort(list,ss);
		
		for (Student details : list) {
			System.out.println(details);
		}
		

	}

}