/**
 * C an Pl ac eF lo we rs
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

public class CanPlaceFlowers {
    public static Boolean canPlaceFlowers(int[] flowerbed, int n){
        int len = flowerbed.length;
        int count = 0;

        for(int i = 0; i<len; i++){
            if(flowerbed[i]==0){
                boolean leftEmpty = (i==0 || flowerbed[i-1]==0);
                boolean rightEmpty = (i==len-1 || flowerbed[i+1]==0);

                if(leftEmpty && rightEmpty){
                    flowerbed[i] = 1;
                    i++;
                    count++;
                    if(count>=n)return true;
                }
            }
        }
        return count>=n;
    }
}

