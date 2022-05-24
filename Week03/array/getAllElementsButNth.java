package com.codestates.coplit; 
import java.util.*;

public class Solution { 
	public int[] getAllElementsButNth(int[] arr, int n) {
    if (n >= arr.length) {
      return arr;
		}
    
    for (int i=n; i<arr.length-1; i++){
        arr[i] = arr[i+1];
    }
    int[] result = Arrays.copyOfRange(arr, 0, arr.length-1);
    return result;

	} 
}
