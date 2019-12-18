package bcits.java.page2;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str) {
		String str1="";
		for (int i = str.length()-1; i >=0 ; i--) {
			str1 = str1+str.charAt(i);
		}
		return str1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		System.out.println("Reversed string is " + reverse(str));
		

	}

}
