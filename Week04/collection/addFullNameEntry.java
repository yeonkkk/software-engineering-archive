package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
    HashMap<String, String> newHashMap = new HashMap<>(hashMap);
    newHashMap.put("fullName", hashMap.get("firstName")+hashMap.get("lastName"));
    return newHashMap;
  }
}
