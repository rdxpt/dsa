/**
 * S ec on dH ig he st In Ar ra y
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
 * Tags: Array
 */
package problem75LC;

public class SecondHighestInArray{
    public static int secondHighest(int[] nums){
        int highest = Integer.MIN_VALUE; //     min 8   8   8   14  19  26  32
        int secHighest = Integer.MIN_VALUE; //  min min 1   7   8   14  19  26
        for(int i : nums){  
            if(i>highest){
                secHighest = highest;
                highest = i;
            } else if(i>secHighest && i<highest){
                secHighest = i;
            }
        }
        return secHighest;
    }
    public static void main(String[] args) {
        int[] nums = {-5, -15};
        System.out.println(secondHighest(nums));
    }
}
