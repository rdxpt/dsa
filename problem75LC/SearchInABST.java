package problem75LC;

public class SearchInABST {
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

    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            TreeNode temp = root;
            while (temp != null) {
                if (val == temp.val)
                    return temp;
                else if (val > temp.val)
                    temp = temp.right;
                else
                    temp = temp.left;
            }
            return null;
        }
    }
}