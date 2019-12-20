package com.ty.bcits.algorithms;

public class LinearSearch {
	public static void linearSearch(int[] a, int num) {  
		int t = 0;
        for(int i=0;i<a.length;i++) {    
            if(a[i] == num) {    
            System.out.println("\nnumber is in " + ++i + " position"); 
             t =1;
            }    
        }
        if(t !=1) {
        System.out.println("\number is not present..."); 
    }  
   }
 }
