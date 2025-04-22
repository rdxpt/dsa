package problem75LC;

import problem75LC.SearchInABST.TreeNode;

public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum){
        if(root==null) return 0;
        int count = countPathsFromNode(root, targetSum);

        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }

    private int countPathsFromNode(TreeNode node, long remainingSum){
        if(node == null) return 0;
        int count = 0;
        if(node.val == remainingSum) count++;

        count += countPathsFromNode(node.left, remainingSum-node.val);
        count += countPathsFromNode(node.right, remainingSum-node.val);

        return count;
    }
}
