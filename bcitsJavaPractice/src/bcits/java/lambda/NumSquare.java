/*WAP to number square  using lambda function*/

package bcits.java.lambda;

import java.util.Scanner;

interface SquareNum {
	public int Square(int a);
}

public class NumSquare {

	public static void main(String[] args) {
		SquareNum a1 = (a)-> {
		return a * a;	
		};
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number1:");
		int num1 =s.nextInt();
		System.out.println("Square of number  is : " + a1.Square(num1));
		}
}
