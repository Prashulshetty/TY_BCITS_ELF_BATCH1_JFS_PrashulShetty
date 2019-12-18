package bcits.java.secondpart;

import java.util.Scanner;

public class IceCream {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter flavour of Icecream :");
		
		Baby flavour1 = new Baby(sc1.nextLine());
	
        
		 System.out.println(flavour1);
		
	}

}