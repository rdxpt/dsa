package problem75LC;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTress {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        leafValue(root1, a1);
        leafValue(root2, a2);
        return a1.equals(a2);
    }
    public void leafValue(TreeNode root, List<Integer> a){
        if(root == null) return;
        if(root.left == null && root.right==null) a.add(root.val);
        else {
            leafValue(root.left, a);
            leafValue(root.right, a);
        }
    }
}
