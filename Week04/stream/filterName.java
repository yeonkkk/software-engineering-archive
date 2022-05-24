package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public String[] filterName(List<String> names) {
    return names.stream()
          .distinct()
          .filter(n -> n.startsWith("김"))
          .sorted()
          .toArray(String[]::new);
  }
}
