package com.codestates.coplit; 
import java.util.*;

public class Solution { 
	public int[] getAllElementsButFirst(int[] arr) {
    if (arr.length == 0) return arr;
		int[] result = Arrays.copyOfRange(arr, 1, arr.length);
		return result;
	} 
}
