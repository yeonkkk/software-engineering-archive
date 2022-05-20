package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public int computeSumOfAllElements(List<Integer> list){
    int sum = list.stream().mapToInt(n -> n).sum();
    return sum;
  }
}
