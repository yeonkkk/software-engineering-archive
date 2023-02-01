import java.util.*;

public class Solution { 
	public boolean balancedBrackets(String str) {
    Stack<String> stack = new Stack<>();
		String check = "({[";
		String cur;

		Map<String, String> pair = new HashMap<>();
		pair.put("{", "}");
		pair.put("[", "]");
		pair.put("(", ")");


		for (int i=0; i < str.length(); i++) {
			cur = String.valueOf(str.charAt(i));
			if (check.contains(cur)) stack.push(cur);
			else {
				if (stack.empty()) return false;
				else {
					if(!pair.get(stack.pop()).equals(cur)) return false;
				}
			}
		}
		if (stack.size() > 0) return false;
		return true;
	} 
}
