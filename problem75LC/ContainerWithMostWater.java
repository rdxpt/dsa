/**
 * C on ta in er Wi th Mo st Wa te r
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

public class ContainerWithMostWater {
    public static int maxArea(int[] height){
        int n = height.length;
        int i = 0, j = n-1;
        int maxVol = 0;
        while(i<=j){
            if(height[i]>height[j]){
                if(height[j]*(j-i)>maxVol) maxVol = height[j]*(j-i);
                j--;
            } else {
                if(height[i]*(j-i)>maxVol) maxVol = height[i]*(j-i);
                i++;
            }
        }
        return maxVol;
    }
}

