package com.codestates.coplit; 
import java.util.*;

public class Solution { 
	public int[] getElementsUpTo(int[] arr, int n) {
    if (n >= arr.length) {
    return new int[]{};
		}

		int[] result = Arrays.copyOfRange(arr, 0, n);
		return result;
	} 
}
