/**
 * C on ta in sD up li ca te II
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

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<=k; i++){
            if(!set.add(nums[i])) return true;
        }
        for(int i=k+1; i<nums.length && i<nums.length; i++){
            set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;  
    }
}

