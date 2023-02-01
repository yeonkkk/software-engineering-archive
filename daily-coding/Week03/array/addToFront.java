package com.codestates.coplit; 

public class Solution { 
	public int[] addToFront(int[] arr, int el) {
    int[] arr2 = new int[arr.length+1];
    arr2[0] = el;
    System.arraycopy(arr, 0, arr2, 1, arr.length);
    return arr2;
	} 
}
