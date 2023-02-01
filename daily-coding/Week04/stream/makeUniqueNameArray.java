package com.codestates.coplit; 
import java.util.*;


public class Solution { 
  public String[] makeUniqueNameArray(List<String> names) {
    return names.stream()
          .distinct()
          .sorted()
          .toArray(String[]::new);
  }
}
