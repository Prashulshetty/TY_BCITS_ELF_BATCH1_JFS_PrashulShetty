/*WAP to add two numbers using lambda function*/

package bcits.java.lambda;

import java.util.Scanner;

interface Addable {
	public int add(int a,int b);
}

public class AddNumbers {

	public static void main(String[] args) {
		Addable a1 = (a,b)-> {
		return a+b;	
		};
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number1:");
		int num1 =s.nextInt();
		System.out.println("Enter the number2:");
		int num2 =s.nextInt();
		System.out.println("sum is : " + a1.add(num1, num2));
		}
}
