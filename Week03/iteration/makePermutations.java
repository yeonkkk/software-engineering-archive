package com.codestates.coplit; 

public class Solution { 
	public String makePermutations(String str) {
    String result = "";
    for (int i=0; i<str.length(); i++){
      for (int j=0; j<str.length(); j++){
        result = result + str.charAt(i) + str.charAt(j) +",";
      }
    }
    return result != "" ? result.substring(0, result.length() - 1) : result;
	} 
}
