import java.util.*;

public class Solution { 
	public String[] removeExtremes(String[] arr) {
		if (arr.length == 0) return null;
		int maxIdx = 0;
		int minIdx = 0;
		int maxLen = arr[0].length();
		int minLen = arr[0].length();

		String[] newArr = new String[arr.length-2];

		for (int i=1; i<arr.length; i++) {
			if(arr[i].length() >= maxLen) {
				maxLen = arr[i].length();
				maxIdx = i;
			}
			if(arr[i].length() <= minLen) {
				minLen = arr[i].length();
				minIdx = i;
			}
		}

		int k = 0;
		for (int i=0; i<arr.length; i++) {
			if (i != minIdx && i != maxIdx) {
				newArr[k] = arr[i];
				k++;
			} 
		}
		return newArr;
	} 
}
