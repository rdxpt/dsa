/**
 * k th Sm al le st El em en t
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DSA
 */
package problem75LC;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class kthSmallestElement {
    public int kthSmallestITS(TreeNode root, int k) {
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty() || curr!=null){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            k--;

            if(k == 0) return curr.val;
            
            curr = curr.right;
        }
        return -1;
    }



    public int kthSmallestElementRS(TreeNode root, int k){
        int[] kVal = {k};
        return findValue(root, kVal);
    }
    public int findValue(TreeNode node, int[] kVal){
        if(node == null) return -1;
        int left = findValue(node.left, kVal);
        if(left != -1) return left;
        kVal[0]--;
        if(kVal[0] == 0) return node.val;
        return findValue(node.right, kVal);
    }
}

