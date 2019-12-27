package bcits.java.secondpart;

import java.util.Scanner;

public class Bullets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Number of bullets to load gun :");
		Gun g = new Gun(s.nextInt());
		System.out.println(g);
	}

}
