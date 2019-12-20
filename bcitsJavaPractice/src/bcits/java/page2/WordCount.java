package bcits.java.page2;

import java.util.Scanner;

public class WordCount {
	public static String count(String str) {
		String s[]=str.split(" ");
		String str1="";
		for (int i = 0; i < s.length; i++) {
			str1 = str1 +" "+ s[i]+s[i].length();
		}
		return str1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		System.out.println("Result string is:\n" + count(str));
		

	}

}
