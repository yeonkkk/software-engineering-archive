package com.codestates.coplit; 

public class Solution { 
	public int countCharacter(String str, char letter) {
    int count = 0;
    for (int i=0; i<str.length(); i++){
      if(str.charAt(i)==letter){
        count++;
      }
    }
    return count;
	} 
}
