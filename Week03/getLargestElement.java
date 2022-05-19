package com.codestates.coplit; 

public class Solution { 
	public int getLargestElement(int[] arr) {
    int max = Integer.MIN_VALUE;;
    for (int i:arr){
      if (max < i){
        max = i;
      }
    }
    return max;
	} 
}
