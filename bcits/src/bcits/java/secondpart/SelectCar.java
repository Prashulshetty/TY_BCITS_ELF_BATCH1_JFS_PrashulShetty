package bcits.java.secondpart;

import java.util.Scanner;

public class SelectCar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("select the car for Driving  :\n 1.Audi \n 2.Benz");
		int opt =s.nextInt();
		Driver d = new Driver();
		if(opt == 1) {
			d.drive(new Audi());		
		} else {
			d.drive(new Benz());	
		}
			

	}

}
