import java.util.*;

public class Solution { 
	public String compressString(String str) {
		if (str.length() < 2) return str;

    int count = 1;
		char cur = str.charAt(0);
		String temp;
		String result = "";

		for (int i=1; i<str.length(); i++) {
			char ch = str.charAt(i);
			temp = String.valueOf(cur);

			if(ch == cur) count++;
			if (ch != cur || i == str.length()-1){
				if(count > 2){
					result += String.valueOf(count) + temp;
					count = 1;
					cur = ch;
				}
				else {
					result += temp;
					if (count == 2) result += temp;
					else if (count == 1 && i == str.length()-1) result += String.valueOf(ch);
					count = 1;
					cur = ch;
				}
			}
		}
		return result;
	} 
}
