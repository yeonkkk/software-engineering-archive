import java.util.*;

public class Solution {  
	public String firstCharacter(String str) {
		if (str.length() == 0) return str;
    String[] arr = str.split(" ");
		String result = "";

		for (String ele : arr) {
			result = result + ele.charAt(0);
		}
		return result;
	} 
}
