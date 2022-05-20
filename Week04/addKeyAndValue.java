package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
    hashMap.put(key, value);
    return hashMap;
  }
}
