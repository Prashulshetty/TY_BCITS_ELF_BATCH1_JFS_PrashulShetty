package bcits.java.com;
import java.util.Scanner;
public class Pattern3{
	
public static void pattern(int n) {
System.out.println("Displaying the Pattern:\n");
	int m = (n/2)+1;

	for(int i = 1; i <= n; i++) {
		if(i<=m){
		for(int k = 1; k <= i; k++) {
			System.out.print("* ");
		}
		System.out.println();
	} else {
		for(int j =1; j <=(m-1); j++) {
			System.out.print("* ");
	}
		m--;
		System.out.println();
	}
}
}

public static void main(String[] args) {

	System.out.println("Enter the size of the row: ");
	Scanner sc1 = new Scanner(System.in);
	int n = sc1.nextInt();
	pattern(n);

	}
}

