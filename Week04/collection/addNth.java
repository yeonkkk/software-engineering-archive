package com.codestates.coplit; 
import java.util.*;

// 나의 풀이
public class  Solution { 
  public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
    if (arrayList.size() < index) return null;
    arrayList.add(index, element);
    return arrayList;
  }
}


// 해설
public class  Solution { 
  public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
    

    // 크기를 벗어난 경우
      if(index < 0 || index >= arrayList.size()){
        return null;
      }
    // 이외의 경우
    arrayList.add(index, element); // 인덱스 지정을 안하면 마지막 요소로 들어감
    return arrayList;
  }
}
