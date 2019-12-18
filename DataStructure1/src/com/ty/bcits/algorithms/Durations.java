package com.ty.bcits.algorithms;

import java.time.Duration;
import java.time.Instant;

public class Durations {
	
	public static void bubbleSortduration(int[] a) {
		Instant s = Instant.now();
		int b[] =BubbleSort.bubbleSort(a);
		ArrayDisplay.display(b);
		Instant e = Instant.now();
		Long duration =Duration.between(s, e).toMillis();
		double seconds = duration /1000.0 ;
		System.out.println();
		System.out.println("bubblesort took " +seconds +" seconds");
		System.out.println();
	}

public static void selectionSortduration(int[] a) {
	Instant s = Instant.now();
	int b[] =SelectionSort.selectionSort(a);
	ArrayDisplay.display(b);
	Instant e = Instant.now();
	Long duration =Duration.between(s,e).toMillis();
	double seconds = duration /1000.0 ;
	System.out.println();
	System.out.println("selectionSort took " +seconds +" seconds");
	System.out.println();
}

public static void MergeSortduration(int[] a) {
	int f=0;
	int l=a.length-1;
	Instant s = Instant.now();
	int b[] =MergeSort.sort(a,f,l);
	ArrayDisplay.display(b);
	Instant e = Instant.now();
	Long duration =Duration.between(s,e).toMillis();
	double seconds = duration /1000.0 ;
	System.out.println();
	System.out.println("mergeSort took " +seconds +" seconds");
	System.out.println();
}

public static void QuickSortduration(int[] a) {
	int f=0;
	int l=a.length-1;
	Instant s = Instant.now();
	int b[] =QuickSort.Qsort(a,f,l);
	ArrayDisplay.display(b);
	Instant e = Instant.now();
	Long duration =Duration.between(s,e).toMillis();
	double seconds = duration /1000.0 ;
	System.out.println();
	System.out.println("mergeSort took " +seconds +" seconds");
	System.out.println();
}


  public static void Reversearrayduration(int[] a) {
		Instant s = Instant.now();
		int b[] =ReverseArray.reverseArray(a);
		ArrayDisplay.display(b);
		Instant e = Instant.now();
		Long duration =Duration.between(s,e).toMillis();
		double seconds = duration /1000.0 ;
		System.out.println();
		System.out.println("reverse array took " +seconds +" seconds");
		System.out.println();
  }
  
  public static void unsortedarrayduration(int[] a) {
		Instant s = Instant.now();
		System.out.println();
		ArrayDisplay.display(a);
		Instant e = Instant.now();
		Long duration =Duration.between(s,e).toMillis();
		double seconds = duration /1000.0 ;
		System.out.println();
		System.out.println("unsorted array took " +seconds +" seconds");
		System.out.println();
  }
  
  public static void linearSearchduration(int[] a,int num) {
		Instant s = Instant.now();
		LinearSearch.linearSearch(a,num);
		Instant e = Instant.now();
		Long duration =Duration.between(s,e).toMillis();
		double seconds = duration /1000.0 ;
		System.out.println("linersearch took " +seconds +" seconds");
	}
  
  public static void BinarySearchduration(int[] a,int num) {
		Instant s = Instant.now();
		BinarySearch.binarySearch(a,num);
		Instant e = Instant.now();
		Long duration =Duration.between(s,e).toMillis();
		double seconds = duration /1000.0 ;
		System.out.println("binarysearch took " +seconds +" seconds");
	}

}
