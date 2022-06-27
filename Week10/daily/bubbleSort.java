import java.util.*;

public class Solution { 
	public int[] bubbleSort(int[] arr) {
    int temp;
		int count;

		for (int i=0; i<arr.length-1; i++){
      count = 0;
			for (int j=0; j<arr.length-i-1; j++){
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
          count++;
				}
			} if (count == 0) break;
		}
		return arr;
	} 
}
