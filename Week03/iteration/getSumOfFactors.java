package com.codestates.coplit; 

public class Solution { 
	public int getSumOfFactors(int num) {
    int sum = 0;
    for (int i=1; i<=num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum;
	} 
}
