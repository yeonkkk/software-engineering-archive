package com.codestates.coplit; 

public class Solution { 
	public int convertToNumber(char character) {
    int result;
    result = Character.getNumericValue(character);
    return result;
  }
}
