package com.codestates.coplit; 

public class Solution { 
	public String getLongestWord(String str) {
    String[] arr = str.split(" ");
    String longWord = arr[0];
    for (String i:arr){
      if (longWord.length() < i.length()){
        longWord = i;
      }
    }
    return longWord;
	} 
}
