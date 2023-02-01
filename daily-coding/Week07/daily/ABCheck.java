import java.util.*;

public class Solution { 
	public boolean ABCheck(String str) {
		int n = str.length();
		String str2 = str.toLowerCase();

		if (n<5) return false;

    for (int i=0; i<n; i++){
			if (str2.charAt(i) == ('a') && n - (i+1) >= 4){
				if (str2.charAt(i+4) == 'b') return true;
			}
			else if (str2.charAt(i) == ('b') && n - (i+1) >= 4){
				if (str2.charAt(i+4) == 'a') return true;
			}
		}
		return false;
	}  
}
