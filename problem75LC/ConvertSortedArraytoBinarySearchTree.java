/**
 * C on ve rt So rt ed Ar ra yt oB in ar yS ea rc hT re e
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
 * Tags: Tree, Binary Search, Sorting, Array
 */
package problem75LC;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBSTNode(nums, 0, nums.length - 1);
    }
    public TreeNode toBSTNode(int[] nums, int low, int high){
        if(low > high) return null;
        int mid = low + (high - low)/2;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = toBSTNode(nums, low, mid - 1);
        curr.right = toBSTNode(nums, mid + 1, high);
        return curr;
    }
}

