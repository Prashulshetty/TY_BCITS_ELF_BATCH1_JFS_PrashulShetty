package bcits.java.secondpart;

import java.util.Scanner;

public class Gift {
	public static void main(String[] args) {
		String gift;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a gift you want to present : ");
		Friend f =new Friend(s.nextLine());
		System.out.println(f);
	}
	
	
	

}
