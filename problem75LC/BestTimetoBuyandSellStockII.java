/**
 * B es tT im et oB uy an dS el lS to ck II
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

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int total_profit = 0;
        int buy = 0;
        for(int i=1; i<prices.length; i++){
            int  profit = prices[i] - prices[buy];
            if(profit <= 0){
                buy = i;
                continue;
            } else {
                total_profit += profit;
            }
        }
        return total_profit;
    }
}

