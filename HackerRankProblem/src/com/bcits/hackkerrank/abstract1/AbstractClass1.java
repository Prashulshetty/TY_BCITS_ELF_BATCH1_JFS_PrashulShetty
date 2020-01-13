package com.bcits.hackkerrank.abstract1;

import java.util.Scanner;

public class AbstractClass1 {

	public static void main(String[] args) {
		System.out.println("Enter the Title");
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}

}
