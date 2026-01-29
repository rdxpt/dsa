/**
 * H_I nd ex
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

import java.util.Arrays;

public class H_Index {
    public int hIndexBindary(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        int hindex = 0;
        int high = n-1, low = 0;

        while(low<=high){
            int mid = low + (high-low)/2;
            int count = n - mid;

            if(citations[mid]>count){
                hindex = count;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return hindex;
    }
    public int HIndexBucket(int[] citations){
        int n = citations.length;
        int[] buckets = new int[n+1];
        for(int c : citations){
            if (c >= n) buckets[n]++;
            else buckets[c]++;
        }
        int count = 0;

        for(int h = n; h >=0; h--){
            count += buckets[h];
            if(count >= h)return h;
        }

        return 0;
    }
}

