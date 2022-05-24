package com.codestates.coplit; 

public class Solution { 
	public String[] getAllWords(String str) {
    if (str.length() == 0) return new String[0];
    String[] result = str.split(" ");
    return result;
  } 
}
