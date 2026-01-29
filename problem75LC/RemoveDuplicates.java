/**
 * R em ov eD up li ca te s
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

// In this problem we are given a sorted array and we have to remove the duplicates and return the array with unique elements only
// we gotta make changes to the current array I suppose


public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        if(nums==null || nums.length==0)return 0;
        int i=1;
        for(int j=1; j<nums.length; j++){
            if(nums[j]!=nums[j-1]){
                nums[i] = nums[j];
                i++;
            }    
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {0};
        int unique = removeDuplicates(nums);
        System.out.println(unique);
        for(int i=0; i<unique; i++) System.out.print(nums[i]+" ");
        System.out.println();
    }
}

