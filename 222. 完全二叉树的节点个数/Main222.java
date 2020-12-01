import javax.swing.tree.TreeNode;

public class Main222 {
}

class Solution222 {
    public int countNodes(TreeNode222 root) {
        if (root == null) {
            return 0;
        }
        TreeNode leftNode;
        int h = 0;
        while ((leftNode = root.left) != null) {
            h++;
        }
        return 0;
    }
}


class TreeNode222 {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode222(int x) { val = x; }
  }
