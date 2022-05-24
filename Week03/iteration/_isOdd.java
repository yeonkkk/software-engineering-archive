package com.codestates.coplit; 

public class Solution { 
	public boolean isOdd(int num) {
    int i = 0;

    boolean odd = true;

    if (num < 0) {
      num *= -1;
    }

    while(i<=num){
      odd = !odd;
      i++;
    } 

    if(odd){
      return true;
    }
    return false;
	}
}
