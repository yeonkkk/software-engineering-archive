package com.codestates.coplit; 
import java.util.*;
import java.util.stream.*;

public class Solution { 
  public List<String> findPeople(List<String> male, List<String> female, String lastName) {
    Stream<String> stream1 = male.stream();
    Stream<String> stream2 = female.stream();
    Stream<String> stream3 = Stream.concat(stream1, stream2);

    return stream3.distinct().filter(n -> n.startsWith(lastName)).sorted().collect(Collectors.toList());
  }
}
