/**
 * R ev er se Wo rd s
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

public class ReverseWords {
    public static String reverseWords(String s){
        String[] arr = s.trim().split("//s+");
        int l = 0, r = arr.length-1;
        while (l<=r) {
            String temp =  arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(String.join(" ", arr));
    }
    public static void main(String[] args) {
        String s = "nigga with a gyatt is picking cotton";
        System.out.println(reverseWords(s));
    }
}

