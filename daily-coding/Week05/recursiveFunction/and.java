import java.util.*;

public class Solution {  
	public boolean and(boolean[] arr){
    if (arr.length == 0) return true;
    boolean[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
    return arr[0]&&and(newArr);
	} 
}
