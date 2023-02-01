import java.util.*;

public class Solution { 
	public Integer modulo(int num1, int num2) {
		if (num2 == 0) return null;
		else if (num1 == 0) return 0;

    while (num1 >= num2) {
			num1 -= num2;
		}
		return num1;
	} 
}
