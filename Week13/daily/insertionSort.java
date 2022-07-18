public class Solution { 
  public int[] insertionSort(int[] arr) {
		
		int size = arr.length;

		for(int i = 1; i < size; i++) {
			int cur = arr[i];
			int j = i - 1;

			while(j >= 0 && cur < arr[j]) {
				arr[j + 1] = arr[j];	
				j--;
			}
			arr[j + 1] = cur;	
		}
		
		return arr;
	}
}
