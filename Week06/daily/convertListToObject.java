import java.util.*;

public class Solution { 
	public HashMap<String, String> convertListToHashMap(String[][] arr) {
    HashMap<String, String> hashMap = new HashMap<>();
		
		for (int i=0; i<arr.length; i++){
			if (arr[i].length != 0 && !hashMap.containsKey(arr[i][0])) hashMap.put(arr[i][0], arr[i][1]);
		}
	return hashMap;
	} 
}
