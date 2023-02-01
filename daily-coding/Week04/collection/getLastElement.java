package com.codestates.coplit; 
import java.util.*;

public class  Solution { 
  public String getLastElement(ArrayList<String> arrayList) {
    if (arrayList.size()==0) {
      return null;
    }
    return arrayList.get(arrayList.size()-1);
  }
}
