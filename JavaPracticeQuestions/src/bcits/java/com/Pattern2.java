package bcits.java.com;
import java.util.Scanner;
public class Pattern2{
	
public static void pattern(int n) {
System.out.println("Displaying the Pattern:\n");

	for(int i = n; i >= 1; i--) {
		for(int k = 0; k < i; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}

public static void main(String[] args) {

	System.out.println("Enter the size of the row: ");
	Scanner sc1 = new Scanner(System.in);
	int n = sc1.nextInt();
	pattern(n);

	}
}

