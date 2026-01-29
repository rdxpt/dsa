/**
 * M ax im um Le ve lS um Of Bi na ry Tr ee
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

import java.util.LinkedList;
import java.util.Queue;

import problem75LC.DeleteNodeInABst.TreeNode;

public class MaximumLevelSumOfBinaryTree {
    public int maxLevelSym(TreeNode root){
        int maxSum = root.val;
        int maxLevel = 1;
        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int sum = 0;
            for(int i=0; i<levelSize; i++){
                TreeNode temp = queue.poll();
                sum += temp.val;
                if(temp.left !=null) queue.offer(temp.left);
                if(temp.right !=null) queue.offer(temp.right);
            }
            if(sum>maxSum){
                maxSum = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel; 
    }
}

