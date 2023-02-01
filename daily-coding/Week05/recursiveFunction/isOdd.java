public class Solution { 
	public boolean isOdd(int num) {
    if (num < 0) num *= -1;
    if (num <= 1) return num == 1 ? true : false;
    return isOdd(num-2);
  }
}
