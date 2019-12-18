/*WAP to find factorial number using lambda function*/

package bcits.java.lambda;

import java.util.Scanner;

interface Facto {
	public int fact(int a);
}

public class Factorial {

	public static void main(String[] args) {
		Facto f1 = (a)-> {
			int res = 1;
			for (int i = a; i > 0; i--) {
				res=res * i;
			}
		return res ;	
		};
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1 =s.nextInt();
		System.out.println("Factorial of given num is : "+f1.fact(num1));
		}
}

