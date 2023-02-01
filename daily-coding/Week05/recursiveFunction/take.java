import java.util.*;

public class Solution { 
	public int[] take(int num, int[] arr){
    if (num == 0 || arr.length == 0) return new int[0];
    else if (num >= arr.length) return arr;
    int[] newArr = Arrays.copyOfRange(arr, 0, arr.length-1);
    return take(num, newArr);
	} 
}
