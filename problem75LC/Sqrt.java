/**
 * S qr t
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

public class Sqrt {
    public static int mySqrt(int x) {
        if(x == 0) return 0;

        int left = 1;
        int right = x;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(mid == x / mid) return mid;
            else if (mid < x / mid) left = mid + 1;
            else right = mid - 1;
        }
        return right;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}

