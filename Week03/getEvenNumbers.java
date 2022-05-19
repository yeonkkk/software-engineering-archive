package com.codestates.coplit; 
import java.util.Arrays;

public class Solution { 
	public int[] getEvenNumbers(int[] arr) {
    return Arrays.stream(arr).filter(i -> i % 2 == 0).toArray();
	} 
}
