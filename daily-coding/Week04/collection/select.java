package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
    HashMap<String, Integer> newHashMap = new HashMap<>();
    for (String key : arr) {
      if (hashMap.containsKey(key)) {
        newHashMap.put(key, hashMap.get(key));
      }
    }
    return newHashMap;
  }
}

