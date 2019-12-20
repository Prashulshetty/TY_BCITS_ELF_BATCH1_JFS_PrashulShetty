package bcits.java.part5;

import java.util.ArrayList;
import java.util.Collections;

public class MobileSort {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add( new Mobile(10,"Mi",10000) );
		a1.add( new Mobile(210,"Oneplus",20000) );
		a1.add( new Mobile(30,"sumsung",22000) );
		a1.add( new Mobile(40,"vivo",9000) );
		
		Collections.sort(a1);
		for (Object M1 : a1) {
			System.out.println(M1);
			
		}
		
	}

}
