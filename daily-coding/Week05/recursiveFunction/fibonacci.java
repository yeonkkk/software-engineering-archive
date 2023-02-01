public class Solution {  
	public int fibonacci(int num){
		if (num <= 1) return num;
    return fibonacci(num-2) + fibonacci(num-1);
	}
}
