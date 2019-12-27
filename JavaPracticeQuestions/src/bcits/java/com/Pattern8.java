package bcits.java.com;

public class Pattern8 {

	public static void main(String[] args) {
		int n=3;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if ((j == n-i) || (j == n+i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
for (int i = 2; i >=0; i--) {
	for (int j2 = 0; j2 < 7; j2++) {
		if ((j2 == n-i) || (j2==n+i)) {
			System.out.print("*");
		} else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}
