package com.codestates.coplit;
import java.util.*;
import java.util.stream.*;

public class Solution { 
  public List<Integer> makeElementDouble(List<Integer> list) {
    return list.stream().map(n-> 2 * n).collect(Collectors.toList());
  }
}
