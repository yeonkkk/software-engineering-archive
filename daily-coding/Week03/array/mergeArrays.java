package com.codestates.coplit; 

public class Solution { 
	public int[] mergeArrays(int[] arr1, int[] arr2) {
    int[] arr3 = new int[arr1.length+arr2.length];
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    return arr3;
	} 
}
