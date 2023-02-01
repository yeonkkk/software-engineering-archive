import java.util.*;

public class Solution {  
	public String convertDoubleSpaceToSingle(String str) {
    String[] strArr = str.split("  ");
    String result = "";

    for (int i=0; i<strArr.length; i++){
      result += strArr[i];
      if (i != strArr.length-1) result += " ";
    }
    return result;
	} 
}
