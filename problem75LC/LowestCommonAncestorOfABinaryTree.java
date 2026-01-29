/**
 * L ow es tC om mo nA nc es to rO fA Bi na ry Tr ee
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

//import java.util.ArrayList;
//import java.util.List;

public class LowestCommonAncestorOfABinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

/*

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = findPath(root, p);
        List<TreeNode> path2 = findPath(root, q);

        if(path1 == null || path2 == null) return null;

        TreeNode lca = null;
        int i=0;

        while(i<path1.size() && i<path2.size()){
            if(path1.get(i) == path2.get(i)){
                lca = path1.get(i);
                i++;
            } else break;
        }

        return lca;
    }
    private List<TreeNode> findPath(TreeNode root, TreeNode target){
        if(root == null || target == null) return null;
        List<TreeNode> path = new ArrayList<>();
        if(dfsFindPath(root, target, path)){
            return path;
        }
        return null;
    }
    private boolean dfsFindPath(TreeNode node, TreeNode target, List<TreeNode> path){
        if(node==null)return false;
        path.add(node);
        if(node == target)return true;
        if(dfsFindPath(node.left, target, path) || dfsFindPath(node.right, target, path)) return true;
        path.remove(path.size() - 1);
        return false;
    }
 */

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null) return right;
        else if(right == null) return left;
        else return root;
    }

}
