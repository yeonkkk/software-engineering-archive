package com.codestates.coplit; 

public class Solution { 
	public String characterAndNumber(String word) {
    String result = "";
    for (int i=0; i<word.length(); i++){
      result += word.charAt(i);
      result += i;
    }
    return result;
	} 
}
