package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
    if (hashMap.containsKey(key)){
      List<String> newList = hashMap.get(key);

      if (newList.size() < index) return null;
      
      return newList.get(index);
    }
    return null;
  }
}
