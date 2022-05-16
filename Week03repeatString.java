package com.codestates.coplit; 

public class Solution { 
	public String repeatString(String str, int num) {
		String result = "";
    for (int i=1; i<=num; i++) {
      result += str;
    }
    return result;
	} 
}

