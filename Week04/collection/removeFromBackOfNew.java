package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
    if (arrayList.size() == 0) return null;
    ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
    arrayList2.remove(arrayList2.size()-1);
    return arrayList2;
  }
}
