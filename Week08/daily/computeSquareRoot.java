import java.util.*;

public class Solution { 
	public String computeSquareRoot(int num) {
    double n = 1.0;
		double[] addNums = {1, 0.1, 0.01, 0.001};

		for(int i=0; i<4; i++){
			while (n*n != num){
				if(n*n == num) break;
				else if(n*n < num) n += addNums[i];
				else {
					n -= addNums[i];
					break;
				}
			}
		}
		return String.format("%.2f", n);
	} 
}
