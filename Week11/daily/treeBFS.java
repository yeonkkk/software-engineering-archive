import java.util.*;

public class Solution { 
	public ArrayList<String> bfs(tree node) {

    ArrayList<String> result = new ArrayList<>();
    Queue<tree> queue = new LinkedList<>();
    tree curNode;
    ArrayList<tree> children;
    
    queue.offer(node);

    while (queue.size() != 0){
      curNode = queue.poll();
      result.add(curNode.getValue());

      children = curNode.getChildrenNode();
      if (children != null) {
        for (int i=0; i < children.size(); i++) {
          queue.offer(children.get(i));
        }
      }
    }
    return result;
	} 

	public static class tree {
    private String value;
    private ArrayList<tree> children;

    public tree(String data) {
      this.value = data;
      this.children = null;
    }

    public tree addChildNode(tree node) {
      if(children == null) children = new ArrayList<>();
      children.add(node);
      return children.get(children.size() - 1);
    }

    public String getValue() {     
      return value;
    }

    public ArrayList<tree> getChildrenNode() {
      return children;
    }
  }
}
