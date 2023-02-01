import java.util.*;

public class Solution { 
	public int queuePrinter(int bufferSize, int capacities, int[] documents) {
    int sec = 0;
    int capa_check = 0;
    Queue<Integer> queue = new LinkedList<>();

    List<Integer> list = new ArrayList<>();
    for (int i : documents) {
      Integer integer = i;
      list.add(integer);
    }

    while (list.size() != 0) {
      if (queue.size() == bufferSize) {
        capa_check -= queue.poll();
      }

      if (capa_check + list.get(0) <= capacities) {
        queue.add(list.get(0));
        capa_check += list.remove(0);
      } else {
        queue.add(0);
      }
      sec += 1;
    }
    return sec + bufferSize;
	} 
}
