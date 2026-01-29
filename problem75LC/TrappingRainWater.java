/**
 * T ra pp in gR ai nW at er
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

public class TrappingRainWater{

    // This is O(N) space complexity using a 2d array to store maxLeft and maxRight Values for each and every element;
    public int trapI(int[] height) {
        int volume = 0;
        int len = height.length;
        int[][] matrix = new int[2][len];


        int maxLeft = 0;
        for(int i=0; i<len; i++){
            maxLeft = Math.max(maxLeft, height[i]);
            matrix[0][i] = maxLeft;
        }
        int maxRight = 0;
        for(int i=len-1; i>=0; i--){
            maxRight = Math.max(maxRight, height[i]);
            matrix[1][i] = maxRight;
        }
        for(int i=0; i<len; i++){
            int maxL = matrix[0][i];
            int maxR = matrix[1][i];
            volume += Math.min(maxR, maxL)-height[i];
        }

        return volume;
    }

    public int trapII(int[] height){
        if (height == null || height.length < 3) return 0;
        int volume = 0;
        int l = 0, r = height.length - 1;
        int maxL = height[0];
        int maxR = height[len - 1];

        while(l<r){
            if(maxL<=maxR){
                l++;
                maxL = Math.max(maxL, height[l]);
                volume += maxL - height[l];
            } else {
                r--;
                maxR = Math.max(maxR, height[r]);
                volume += maxR - height[r];
            }
        }

        return volume;
    }
}
