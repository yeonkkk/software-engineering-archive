import java.util.*;

public class Solution { 
	public int arrSum(int[] arr){
    if (arr.length == 0) return 0;
    int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
    return arr[0] + arrSum(newArr);
  }
}
