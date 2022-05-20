package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
    if (arrayList.size() < index) return null;
    arrayList.set(index, str);
    return arrayList;
  }
}

// 해설
public class Solution { 
  public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
      // 크기를 벗어날 경우
      if(index >= arrayList.size()) {
        return null;
      }
      // 이외의 경우
      arrayList.set(index, str);
      return arrayList;
  }
}
