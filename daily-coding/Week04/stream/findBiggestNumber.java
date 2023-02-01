package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public Integer findBiggestNumber(int[] arr) {
    if (arr.length == 0) return null;
    return Arrays.stream(arr).max().getAsInt();
  }
}
