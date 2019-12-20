package com.ty.bcits.algorithms;

public class BinarySearch {
	public static void binarySearch(int a[],int num) { 
		int first = 0;
		int t =0;
		int last=a.length-1;
		   int mid = (first + last)/2;  
		   while( first <= last ) {  
		      if ( a[mid] < num ) {  
		        first = mid + 1;     
		      } else if ( a[mid] == num ) {  
		        System.out.println("Number is found at " + ++mid + " position"); 
		        t =1;
		        break;  
		      } else { 
		         last = mid - 1;  
		      } 
		      mid = (first + last)/2;  
		   } 
		   if( t != 1) {
		      System.out.println("Number is not found!");  
		  
		} 
    }
}