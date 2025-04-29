package problem75LC;

public class LongestZigZagPathInABinaryTree {

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
    int maxLength = 0;
    public int longestZigZaf(TreeNode root){
        dfs(root.left, true, 0);
        dfs(root.right, false, 0);
        return maxLength;
    }
    public void dfs(TreeNode node, boolean isLeft, int length){
        if(node==null) return;
        maxLength = Math.max(maxLength, length);

        if(isLeft){
            dfs(node.right, false, length+1);
            dfs(node.left, true, 1);
        } else {
            dfs(node.left, true, length+1);
            dfs(node.right, false, 1);
        }
    }
}
