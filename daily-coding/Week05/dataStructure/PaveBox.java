import java.util.*;

public class Solution { 
	public int paveBox(Integer[] boxes) {
    Queue<Integer> queue = new LinkedList<>();
    for (Integer box : boxes) {
        queue.add(box);
    }
    int max = 0;
    int cur = boxes[0];
    int count = 0;
    int n;

    if (boxes.length == 0) return 0;

    while (queue.size() != 0) {
        n = queue.poll();
        if (cur >= n) {
            count += 1;
        } else if (cur < n) {
            count = 1;
            cur = n;
        }
        if (max < count) {
            max = count;
        }
    }
    return max;
  }
}
    // for (int ele : boxes) {
    //   if (cur >= ele) {
    //     count += 1;
    //   }
    //   else {
        // if (max < count) {
        //   max = count;
        // }
        // count = 1;
        // cur = ele;
    //   }
    // }
    // return max;
	// } 
