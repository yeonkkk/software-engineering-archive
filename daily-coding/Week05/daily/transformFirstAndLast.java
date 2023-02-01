import java.util.*;

public class Solution { 
	public HashMap<String, String> transformFirstAndLast(String[] arr) {
    if (arr.length == 0) return null;
		HashMap <String, String> hashMap = new HashMap<>();
		hashMap.put(arr[0], arr[arr.length-1]);
		return hashMap;
	} 
}
