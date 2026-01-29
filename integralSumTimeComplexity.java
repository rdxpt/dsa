/**
 * i nt eg ra lS um Ti me Co mp le xi ty
 *
 * Purpose:
 * - DSA practice solution (revision notes at top).
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
public class integralSumTimeComplexity {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println(sumAlgo1(999999));
        System.out.println("Time Taken : "+(System.currentTimeMillis()-now)+" ms");
        now = System.currentTimeMillis();
        System.out.println(sumAlgo2(999999));
        System.out.println("Time Taken : "+(System.currentTimeMillis()-now)+" ms");
    }

    public static int sumAlgo1(int n){
        return n*(n+1)/2;
    }

    public static int sumAlgo2(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
