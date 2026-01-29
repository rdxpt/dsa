/**
 * R ev er se Vo we ls
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

public class ReverseVowels {
    public String reverseVowels(String s){
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length-1;
        String vowels = "aeiouAEIOU";

        while(l<r){
            while(l<r && vowels.indexOf(arr[l])==-1)l++;
            while(l<r && vowels.indexOf(arr[r])==-1)r--;
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++; r--;
        }

        return new String(arr);
    }
}
