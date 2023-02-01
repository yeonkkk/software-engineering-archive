import java.util.*;
import java.util.stream.Collectors;

public class Solution { 
	public boolean isSubsetOf(int[] base, int[] sample) {
    
		HashSet<Integer> baseSet = new HashSet();
    HashSet<Integer> sampleSet = new HashSet();

		for (int i=0; i < base.length; i++) {
			baseSet.add(base[i]);
			if(i < sample.length) sampleSet.add(sample[i]);
		}

		return baseSet.containsAll(sampleSet);
	} 
}
