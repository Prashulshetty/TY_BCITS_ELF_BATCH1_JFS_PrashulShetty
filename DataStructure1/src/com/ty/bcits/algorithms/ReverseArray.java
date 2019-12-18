package com.ty.bcits.algorithms;

public class ReverseArray {
	public static int [] reverseArray(int[] a) {
		int j=0;
		int[] b =new int[a.length];
		for (int i = a.length-1; i >= 0; i--) {
			b[j] = a[i];
			j++;
		}
		return b;
	}

}
