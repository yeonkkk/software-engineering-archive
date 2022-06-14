import java.util.*;

public class Solution { 
	public boolean superIncreasing(int[] arr) {
    int sum = arr[0];

    for (int i=1; i<arr.length; i++) {
      if (sum >= arr[i]) return false;
      else sum += arr[i];
    }
    return true;
	} 
}
