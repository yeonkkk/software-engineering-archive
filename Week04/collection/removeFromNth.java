package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public String removeFromNth(ArrayList<String> arrayList, int index) {
    if (arrayList.size() == 0 || arrayList.size() < index) return null;
    return arrayList.remove(index);
  }
}

