public class Solution { 
	public int rotatedArraySearch(int[] rotated, int target) {
    int left = 0;
		int right = rotated.length - 1;

		while(left <= right) {
			int mid = (right + left) / 2;

			if(rotated[mid] == target) {
				return mid;
			}
      else if (rotated[left] == target) {
        return left;
      }
      else if (rotated[right]== target) {
        return right;
      }

			if (rotated[left] < rotated[mid]) {
      // 왼쪽 정렬 내에 타겟 존재
      	if (target < rotated[mid] && rotated[left] <= target) {
      	  right = mid - 1;
      	} else {
       	 left = mid + 1;
      	}
    	} else {
      // 오른쪽 정렬 내에 타겟 존재
				if (target <= rotated[right] && rotated[mid] < target) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
    	}
		}

		return -1;
	} 
}
