package bcits.java.page2;

import java.util.Scanner;

public class Wordswap {
	public static String count(String str) {
		String s[]=str.split(" ");
		String res="";
		for (int i = 0; i < s.length; i++) {
			if(i==0) {
			res+=s[s.length-1]+" ";
			} else if(i%2==0) {
				res+=s[i-2]+" ";
			} else {
				res+=s[i]+" ";
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		System.out.println("Result string is:\n" + count(str));
		

	}

}
