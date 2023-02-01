package com.codestates.coplit; 
import java.util.*;

public class Solution { 
	public int[] getElementsAfter(int[] arr, int n) {
    if (arr.length < n) return new int[0];
    int[] arr2 = new int[arr.length-n];
    System.arraycopy(arr, n, arr2, 0, arr.length-n);
    return arr2;

    // if (n >= arr.length) {
		// 	return new int[]{};
		// }

		// int[] result = Arrays.copyOfRange(arr, n, arr.length);
		// return result;

	} 
}
