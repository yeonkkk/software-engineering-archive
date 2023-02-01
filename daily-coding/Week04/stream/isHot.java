package com.codestates.coplit;
import java.util.*;

public class Solution { 
  public boolean isHot(int[] temperature) {
    if (temperature.length != 7) return false;
    long days = Arrays.stream(temperature)
                .filter(n -> n >= 30)
                .count();
    if (days >= 3) return true;
    return false;
  }
}
