package com.ty.bcits.algorithms;

import java.util.Scanner;

public class SortMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = s.nextInt();
		int[] a = RandomArray.array(size);
		Durations.unsortedarrayduration(a);
		Durations.Reversearrayduration(a);
		Durations.bubbleSortduration(a);
		Durations.selectionSortduration(a);
		Durations.MergeSortduration(a);
		Durations.QuickSortduration(a);
	}

}
