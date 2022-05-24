package com.codestates.coplit; 

public class Solution { 
	public int[] fibonacci(int num) {
    int[] arr = new int[num + 1];
    for (int i = 0; i < num + 1; i++) {
      if (i == 0) arr[i] = 0;
      else if (i == 1) arr[i] = 1;
      else arr[i] = arr[i-2] + arr[i-1];
    }
    return arr;
	} 
}
