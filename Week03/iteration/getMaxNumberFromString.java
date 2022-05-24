package com.codestates.coplit; 

public class Solution { 
    public int getMaxNumberFromString(String str) {
    int max = 0;
    for(int i=0; i<str.length(); i++){
      if(Character.getNumericValue(str.charAt(i))>max){
        max = Character.getNumericValue(str.charAt(i));
      } 
    }
    return max;
    } 

}
