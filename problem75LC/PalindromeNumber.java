/**
 * P al in dr om eN um be r
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

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] arr = Integer.toString(x).toCharArray();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]!=arr[n-i-1]){
                return false;
            }
        }
        return true;
    }
}

