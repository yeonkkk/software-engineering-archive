import java.util.*;

public class Solution { 
	public boolean powerOfTwo(long num) {
		while (true) {
    if (num == 2 || num == 1) return true;
		else if (num < 1 || num % 2 != 0) return false;
		else num = num / 2;
		}
	} 
}
