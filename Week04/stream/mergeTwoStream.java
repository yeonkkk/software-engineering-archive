package com.codestates.coplit; 
import java.util.*;
import java.util.stream.*;

public class Solution { 
  public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
    Stream<String> stream1 = list1.stream();
    Stream<String> stream2 = list2.stream();
    return Stream.concat(stream1, stream2).collect(Collectors.toList());
  }
}
