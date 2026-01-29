/**
 * T ow er sO fH an oi
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

public class TowersOfHanoi {
    public static void TOH(int n, char A, char B, char C){
        if(n==1){
            System.out.println("Move disk 1 from "+ A + " to " + C);
            return;
        }

        TOH(n-1, A, C, B);
        System.out.println("Move disk " + n + " from " + A + " to " + C);
        TOH(n-1, B, A, C);
    }
    public static void main(String[] args) {
        TOH(4, 'A', 'B', 'C');
    }
}

