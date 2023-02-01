import java.util.*;

public class Solution { 
	public String insertDash(String str) {
    String[] strArr = str.split("");
		String result = "";
		int n, k;

		if (str.length() == 0) return null; 

		for (int i=0; i < strArr.length; i++){
			if (i == strArr.length - 1) {
				result += strArr[i];
				return result;
			}
		 n = Integer.valueOf(strArr[i]);
		 k = Integer.valueOf(strArr[i+1]);
		 if (n % 2 != 0 && k % 2 != 0) result = result + strArr[i] + "-";
		 else result += strArr[i];
		}
		return result;
	} 
}
