import java.util.*;

public class Solution { 
	public int test(int num, int[] check) {
			if (num <= 2) return num;
			else if(check[num] != 0) return check[num];
			else check[num] = test(num-1, check) + test(num-2, check);
			return check[num];
	}

	public int tiling(int num) {
			int[] check = new int[num+1];
			return test(num, check);
	}
}
