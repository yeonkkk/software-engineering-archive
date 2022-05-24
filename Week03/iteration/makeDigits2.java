package com.codestates.coplit; 

public class Solution { 
	public String makeDigits2(int num) {
    int i = 1;
    String result = "";
    while (i < num) {
      result += i+"-";
      i++;
    }
    return result + num; 
	} 
}
