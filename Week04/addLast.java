package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
    arrayList.add(arrayList.size(), str);
    return arrayList;
  }
}

