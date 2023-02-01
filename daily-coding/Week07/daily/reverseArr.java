import java.util.*;

public class Solution { 
	public int[] reverseArr(int[] arr){
    int n = arr.length;
	
		if (n == 0) return arr;

		int[] newArr1 = new int[n];
		newArr1[0] = arr[n-1];

		int[] newArr2 = Arrays.copyOfRange(arr, 0, n-1);
		System.arraycopy(reverseArr(newArr2), 0, newArr1, 1, n-1);

		return newArr1;
	} 
}
