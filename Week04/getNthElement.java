package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
    if (arrayList.size() == 0 || arrayList.size() < index) {
      return null;
    }
    return arrayList.get(index);
  }
}
