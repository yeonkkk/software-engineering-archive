package com.codestates.coplit; 

public class Solution { 
	public String invoke() {
    String word;
    word = returnWordWithJoy("I love coding");
    return word;
  }

  public static String returnWordWithJoy(String str) {
    if(str.equals("")) return "empty value";
    else return str + "!";
  }
}
