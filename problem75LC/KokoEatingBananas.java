/**
 * K ok oE at in gB an an as
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

import java.util.Arrays;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h){
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        while(left<right){
            int mid = left+(right-left)/2;
            int hours = getTotalHours(piles, mid);
            if(hours <= h) right = mid;
            else left = mid+1;
        }
        return left;
    }
    public static int getTotalHours(int[] piles, int k){
        int hours = 0;
        for(int pile : piles){
            hours += (pile+k-1)/k;
        }
        return hours;
    }
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] {3,6,7,11}, 8));
    }
}

