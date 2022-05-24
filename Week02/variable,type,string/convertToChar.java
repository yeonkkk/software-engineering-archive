package com.codestates.coplit; 

public class Solution { 
	public char convertToChar(int num) {
    char result;
    result = Character.forDigit(num, 10);
    return result;
  }
}
