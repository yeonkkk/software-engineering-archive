package com.codestates.coplit; 

public class Solution { 
	public int sumTo(int num) {
    int result = 0;
    for(int i = 0; i <= num; i++){
      result += i;
    }
    return result;
  }
}
