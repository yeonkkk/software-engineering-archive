package com.codestates.coplit; 

public class Solution { 
	public String makeMultiplesOfDigit(int num) {
    String result ="";
    for (int i=1; i<=num; i++){
      if (i % 3 == 0) {
        result += i;
      }
    }
    return result;
	} 
}

