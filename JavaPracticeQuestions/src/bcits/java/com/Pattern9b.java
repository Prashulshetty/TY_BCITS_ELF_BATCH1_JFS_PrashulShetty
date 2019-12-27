package bcits.java.com;
import java.util.Scanner;
public class Pattern9b{
	
public static void pattern(int n) {
	System.out.println("Displaying the Pattern:\n");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
      		if((j==i) || (j==n-1-i)){
      			System.out.print("* ");
		} else {
			System.out.print("  ");
			}
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


