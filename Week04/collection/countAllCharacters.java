package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public HashMap<Character, Integer> countAllCharacter(String str) {
    if (str.isEmpty()) {
      return null;
    }

    HashMap<Character, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char curChar = str.charAt(i);

      if (hashMap.containsKey(curChar)) {
        int value = hashMap.get(curChar); 
        hashMap.put(curChar, value + 1); 
      }
       else {
        hashMap.put(curChar, 1);
      }
    }
    return hashMap;
  }
}
