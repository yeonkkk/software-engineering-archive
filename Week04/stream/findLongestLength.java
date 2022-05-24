package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public int findLongestLength(String[] strArr) {
    if (strArr.length == 0) return 0;
    return Arrays.stream(strArr).mapToInt(String::length).max().getAsInt();
  }
}
