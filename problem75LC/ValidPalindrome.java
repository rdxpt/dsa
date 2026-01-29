/**
 * V al id Pa li nd ro me
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

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] s1 = s.toLowerCase().toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while(low<=high){
            if(Character.valueOf(c) >  || Character.isDigit(s1[low])){
                low++; continue;
            }
            if(s1[high] == ' ' || Character.isDigit(s1[high])){
                high++; continue;
            }
            if(s1[low] != s1[high]) return false;
        }
        return true;
    }   
}

