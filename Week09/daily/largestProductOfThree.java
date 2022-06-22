import java.util.*;

public class Solution { 
	public int largestProductOfThree(int[] arr) {
		int max = Integer.MIN_VALUE;
		int cur;

    for (int i=0; i<arr.length; i++){
			for (int j=1; j<arr.length; j++){
				for (int k=2; k<arr.length; k++){
					if(i == j || j == k || k == i) continue;
					cur = arr[i] * arr[j] * arr[k];
					if (max < cur) max = cur;
				}
			}
		}
		return max;
	} 
}
