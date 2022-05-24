package com.codestates.coplit; 

public class Solution { 
	public String makeOddDigits(int num) {
    int i = 1;
    String result = "";
    while (num> 0) {
      result += i;
      i += 2;
      num -= 1;
    }
    return result; 
	} 
}
