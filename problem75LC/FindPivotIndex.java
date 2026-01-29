/**
 * F in dP iv ot In de x
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Define a DP state + transition; decide memoization vs tabulation.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DP
 */
package problem75LC;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums){
        int leftSum=0;
        int rightSum=0;
        int n=nums.length;
        for(int i : nums){
            rightSum+=i;
        }
        for(int i=0; i<nums.length; i++){
            if(i!=0)leftSum+=nums[i-1];
            if(i!=n-1)rightSum-=nums[i];
            if(i==n-1)rightSum=0;
            if(leftSum==rightSum)return i;
        }
        return -1;
    }
}

