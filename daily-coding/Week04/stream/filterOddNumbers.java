package com.codestates.coplit; 
import java.util.*;
import java.util.stream.Collectors;

public class Solution { 
  public List<Integer> filterOddNumbers(List<Integer> list){
    List<Integer> result = list.stream()
                            .filter(n -> n % 2 == 0)
                            .collect(Collectors.toList());
    return result;
  }
}
