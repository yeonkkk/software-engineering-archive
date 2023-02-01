import java.util.*;

public class Solution { 
	public int subFibonacci(int n, int[] arr) {
		if (arr[n] == 0) arr[n] = subFibonacci(n-1, arr) + subFibonacci(n-2, arr); 
		return arr[n];
	}

	public int fibonacci(int num) {
		if (num <= 1) return num;
		int[] arr = new int[num+1];
		arr[1] = 1;
		arr[2] = 1;
		return subFibonacci(num, arr);
	} 
}
