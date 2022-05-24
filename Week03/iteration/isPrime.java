package com.codestates.coplit; 

public class Solution { 
	public boolean isPrime(int num) {
    int count = 0;
    for (int i=1; i<=num; i++){
      if (num % i == 0) {
        count ++;
      }
    }
    return count==2 ? true:false;
	} 
}
