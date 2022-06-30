import java.util.*;

public class Solution { 

    ArrayList<String> arrList = new ArrayList<String>();

  public ArrayList<String> dfs(tree node) {

      ArrayList<tree> children = node.getChildrenNode();
      arrList.add(node.getValue());

      if(children == null) return arrList;

      
      for (int i=0; i<children.size(); i++) {
        dfs(children.get(i));
      }

    return arrList;
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
