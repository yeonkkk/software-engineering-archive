package com.codestates.coplit; 
public class Solution { 
	public String makeDigits(int num) {
		String result = "";
    for (int i=1; i<=num; i++){
      result += i;
    }
    return result;
	} 
}
