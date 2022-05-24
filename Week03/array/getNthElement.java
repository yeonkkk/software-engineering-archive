package com.codestates.coplit; 

public class Solution { 
	public int getNthElement(int[] arr, int index) {
		if (arr.length == 0) return -1;
		else if(index >= arr.length) return -2;
		return arr[index];
	} 
}
