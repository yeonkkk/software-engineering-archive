package com.codestates.coplit; 

public class Solution { 
	public String replaceAll(String str, char from, char to) {
    String result = "";
    for (int i=0; i<str.length(); i++){
      if (str.charAt(i) == from){
        result += to;
      }
      else {
        result += str.charAt(i);
      }
    }
    return result;
	} 
}
