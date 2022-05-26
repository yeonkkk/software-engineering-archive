import java.util.*;

public class Solution { 
	public int[] drop(int num, int[] arr){
    if (num == 0 || arr.length == 0) return arr;
    int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
    return drop(num-1, newArr);
	} 
}
