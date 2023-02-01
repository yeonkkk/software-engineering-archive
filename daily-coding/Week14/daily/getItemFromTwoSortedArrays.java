import java.util.*;

public class Solution { 
	public static int getItemFromTwoSortedArrays(int[] arr1, int[] arr2, int k) {
		int len1 = arr1.length;
		int len2 = arr2.length;

		int[] newArr = new int[len1 + len2];
		System.arraycopy(arr1, 0, newArr, 0, len1);
		System.arraycopy(arr2, 0, newArr, len1, len2);
		Arrays.sort(newArr);

		return newArr[k-1];
	}
}
