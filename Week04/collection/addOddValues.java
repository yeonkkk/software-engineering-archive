package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public int addOddValues(HashMap<Character, Integer> hashMap) {
    Collection <Integer> values = hashMap.values(); 
    int sum = 0;
    for (int value : values){
      if (value % 2 ==0) sum += value;
    }
    return sum;
  }
}
