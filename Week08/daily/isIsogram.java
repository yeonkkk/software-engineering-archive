import java.util.*;

public class Solution { 
	public boolean isIsogram(String str) {

    if (str.length() == 0) return true;
		int[] check = new int[26];
		char ch;
		int idx;
		String newStr = str.toLowerCase();

		for (int i=0; i < str.length(); i++){
			ch = newStr.charAt(i);
			idx = ch-97;

			if (check[idx] == 0) check[idx] += 1;
			else return false;
		}
		return true;
	} 
}
