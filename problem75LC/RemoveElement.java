/**
 * R em ov eE le me nt
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

public class RemoveElement {
    public static int removeElementI(int[] nums, int val){
        int i=0, j=nums.length-1;
        while(i<=j){
            if(nums[i]==val){
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }

        }
        return j+1;
    }
    public static int removeElementII(int[] nums, int val){
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[i]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}

