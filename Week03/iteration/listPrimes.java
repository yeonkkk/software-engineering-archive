package com.codestates.coplit; 

public class Solution { 
	public String listPrimes(int num) {
    int count = 0;
    String result = "2";

    for (int i=3; i<=num; i++){
      count = 0;
      for (int j=1; j<=i; j++){
        if (i % j == 0) {
          count++;
        }
      }
      if (count == 2) {
        result += "-" + i;
      }
    }
    return result;
	} 
}
