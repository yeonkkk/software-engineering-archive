import java.util.*;

public class Solution { 
	public ArrayList<Stack> browserStack(String[] actions, String start) {
    Stack<String> prevStack = new Stack<>();
    Stack<String> nextStack = new Stack<>();
    Stack<String> current = new Stack<>();
    ArrayList<Stack> result = new ArrayList<>();
		
    if (Character.isUpperCase(start.charAt(0))) current.push(start);

    for (String ele : actions) {
      // 1. 새로운 페이지 접속
      if (Character.isUpperCase(ele.charAt(0))) {
        prevStack.push(current.pop());
        current.push(ele);
        // 다음 페이지 초기화
        nextStack.clear();
      }

      // 2. 뒤로가기 버튼 누를 경우 (-1)
      else if (ele == "-1" && !prevStack.empty()) {
        nextStack.push(current.pop());
        current.push(prevStack.pop());
      }

      // 3. 앞으로가기 버튼 누를 경우 (1)
      else if (ele == "1" && !nextStack.empty()) {
        prevStack.push(current.pop());
        current.push(nextStack.pop());
      }
    }
    result.add(prevStack);
    result.add(current);
    result.add(nextStack);
    return result;
	} 
}
