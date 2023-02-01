import java.util.*;

public class Solution { 
	public int computeWhenDouble(double interestRate) {
    double base = 1;
		double newRate = 1 + interestRate * 0.01;
		int result = 0;
		while (base < 2) {
			base = base * newRate;
			result++;
		}
		return result;
	} 
}
