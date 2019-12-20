/*Enter the String:
hoga beda hudugi nana bittu
Result string is:
agoh adeb iguduh anan uttib*/

package bcits.java.page2;

import java.util.Scanner;

public class WordReverse {
	public static String reverse(String str) {
		String s[]=str.split(" ");
	
		String str1="";
		for (int i = 0; i < s.length; i++) {
			String str3="";
			String str2 = s[i];
			for (int j = str2.length()-1; j >= 0 ; j--) {
				 str3=str3 + str2.charAt(j);
			}
			str1 = str1 + str3 + " ";
		}
		return str1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		System.out.println("Result string is:\n" + reverse(str));
		

	}

}
