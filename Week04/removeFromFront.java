package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public Integer removeFromFront(ArrayList<Integer> arrayList) {
    if (arrayList.size() == 0) return null;
    return arrayList.remove(0);
  }
}

