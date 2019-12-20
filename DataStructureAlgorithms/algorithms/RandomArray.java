package com.ty.bcits.algorithms;

import java.util.Random;

public class RandomArray {
		public static int[] array(int size) {
			Random rd = new Random(); 
		    int[] a = new int[size];
		    for (int i = 0; i < size; i++) {
		       a[i] = rd.nextInt(10);
		    }
		    return a;		    
			}

	}


