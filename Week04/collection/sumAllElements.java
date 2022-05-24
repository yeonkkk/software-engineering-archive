package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public int sumAllElements(ArrayList<Integer> arrayList) {   
    int sum = 0;
    Iterator<Integer> it = arrayList.iterator();
    while (it.hasNext()){
      int num = it.next();
      sum += num;
    }
    return sum;
  }
}

