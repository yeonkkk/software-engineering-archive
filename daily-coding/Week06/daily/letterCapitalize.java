import java.util.*;

public class Solution { 
public String letterCapitalize(String str) {
	if (str.length() == 0) return "";
	char cur;
	int count = 0;
	String result = "";

	for (int i=0; i<str.length(); i++){
		cur = str.charAt(i);
		if (cur == ' ') count ++;
		if (count == str.length()) return "";

		if (Character.isLetter(cur) && (i==0 || str.charAt(i-1) == ' ')){
			result += String.valueOf(cur).toUpperCase();
		}
		else {
			result += String.valueOf(cur);
		}
	}
	return result;
	}
}
