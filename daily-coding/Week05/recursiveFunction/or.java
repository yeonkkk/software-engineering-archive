import java.util.*;

public class Solution { 
	public boolean or(boolean[] arr){
    if (arr.length == 0) return false;
    boolean[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
    return arr[0] || or(newArr);
	} 
}
