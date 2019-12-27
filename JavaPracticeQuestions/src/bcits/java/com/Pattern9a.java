package bcits.java.com;
import java.util.Scanner;
public class Pattern9a {
static void pattern(Object str1) {
	int max = 100;
	String str = (String) str1;
	int n = str.length();
	if (n % 2 == 0) {
		System.out.print("Not possible. Please enter odd length string.\n");
	} else {
		Object a[][] = new Object[max][max];
		int m = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = " ";
			}
		}	

		for (int i = 0; i < n; i++) {
			a[i][m] = str.charAt(i);
		}
		for (int i = 0; i < n; i++) {
			a[m][i] = str.charAt(i);
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
			}
	  }
}


public static void main(String[] args) {

Scanner sc1 = new Scanner(System.in);

System.out.println("Enter the data to be printed");
Object data = sc1.next();

pattern(data);
}

} 