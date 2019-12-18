package bcits.java.secondpart;

import java.util.Scanner;

public class Fuel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter type of Fuel:");
		String f = s.nextLine();
		System.out.println("Enter initial fuel :");
		int n =s.nextInt();
		Car c = new Car(f,n);
		System.out.println(c);
		}
}

