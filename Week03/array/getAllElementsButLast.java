package com.codestates.coplit; 
import java.util.*;

public class Solution { 
	public int[] getAllElementsButLast(int[] arr) {
    if (arr.length == 0) return arr;
		int[] result = Arrays.copyOfRange(arr, 0, arr.length-1);
		return result;
	} 
}
