/**
 * R ev er se In te ge r
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

public class ReverseInteger {
    public static int reverse(int x){
        int reverse = 0;
        while(x!=0){
            int digit = x%10;
            if((reverse>Integer.MAX_VALUE/10) || (reverse==Integer.MAX_VALUE/10 && digit>7)) return 0;
            if((reverse<Integer.MIN_VALUE/10) || (reverse==Integer.MAX_VALUE/10 && digit<-8)) return 0;
            reverse = reverse*10+digit;
            x /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-412));
    }
}

