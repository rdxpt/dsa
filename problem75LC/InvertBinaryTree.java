/**
 * I nv er tB in ar yT re e
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Use recursion (DFS) or iterative traversal; watch for null/base cases.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Tree
 */
package problem75LC;

public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        swap(root);
        if(root.left != null) invertTree(root.left);
        if(root.right != null) invertTree(root.right);
        return root;
    }

    public static void swap(TreeNode node){
        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;
    }
}

