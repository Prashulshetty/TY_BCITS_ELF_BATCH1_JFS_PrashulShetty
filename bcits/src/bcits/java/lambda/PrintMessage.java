/*WAP to PrintMessage using lambda function*/

package bcits.java.lambda;

import java.util.Scanner;

interface PrintMsg{
	public void print1(String msg);
}

public class PrintMessage {

	public static void main(String[] args) {
		PrintMsg p1 = (msg)-> {
			System.out.println(msg); 	
		};
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the message:");
		String msg =s.nextLine();
		p1.print1(msg);
		}
}

