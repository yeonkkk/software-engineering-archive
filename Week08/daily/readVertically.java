import java.util.*;

public class Solution { 
	public String readVertically(String[] arr) {
    String result = "";
    int maxLen = 0;

    for (String ele : arr) {
      if (maxLen < ele.length()) maxLen = ele.length();
    }

    for (int i=0; i<maxLen; i++){
      for (String ele : arr) {
        if (ele.length() > i) result += String.valueOf(ele.charAt(i));
      }
    }
    return result;
	} 
}
