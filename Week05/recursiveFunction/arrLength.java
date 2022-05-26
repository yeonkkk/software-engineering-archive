import java.util.*;

public class Solution { 
	public int arrLength(int[] arr){
    if (arr.length == 0) return 0;
    int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
    return 1 + arrLength(newArr);
	} 
}
