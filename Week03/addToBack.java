package com.codestates.coplit; 

public class Solution { 
	public int[] addToBack(int[] arr, int el) {
    int[] arr2 = new int[arr.length+1];
    arr2[arr.length] = el;
    System.arraycopy(arr, 0, arr2, 0, arr.length);
    return arr2;
	} 
}
