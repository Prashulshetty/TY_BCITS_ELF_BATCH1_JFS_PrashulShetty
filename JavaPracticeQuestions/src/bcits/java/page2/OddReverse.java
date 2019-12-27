/*Enter the String:
hoga beda hudugi nana bittu
Result string is:
agoh beda iguduh nana uttib*/

package bcits.java.page2;

import java.util.Scanner;

public class OddReverse {
	public static String reverse(String str) {
		String s[]=str.split(" ");
		
		String res="";
		for (int i = 0; i < s.length; i++) {
			if (i%2==0) {
		
			String str3="";
			String str2 = s[i];
			
			for (int j = str2.length()-1; j >= 0 ; j--) {
				 str3 += str2.charAt(j);
			}
			res +=str3 +" ";
			}else {
				res += s[i] + " " ;
		}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		System.out.println("Result string is:\n" + reverse(str));
		

	}

}
