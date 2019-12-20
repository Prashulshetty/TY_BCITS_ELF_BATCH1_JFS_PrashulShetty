package com.ty.bcits.algorithms;

public class QuickSort {

public static int Quick(int arr[], int low, int high) { 
    int pivot = arr[high];  
    int i = (low-1); 
    for (int j=low; j<high; j++) { 
        if (arr[j] <= pivot) { 
            i++; 
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
    } 
    int temp = arr[i+1]; 
    arr[i+1] = arr[high]; 
    arr[high] = temp; 
    return i+1; 
} 

public static  int[]  Qsort(int arr[], int low, int high) 
{ 
    if (low < high) 
    { 
        
        int pi = Quick(arr, low, high); 

     
        Qsort(arr, low, pi-1); 
        Qsort(arr, pi+1, high); 
    } 
    return arr;
 }

}