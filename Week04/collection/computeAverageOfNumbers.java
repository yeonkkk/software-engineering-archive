package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public double computeAverageOfNumbers(List<Integer> list) {
    if (list.size() == 0) return 0.0;
    double avg = list.stream()
                  .mapToDouble(n->n)
                  .average()
                  .getAsDouble();
    return avg;
  }
}
