/**
 * S tr in gC om pr es si on
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Use frequency maps / two pointers / stack depending on pattern constraints.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: String
 */
package problem75LC;

public class StringCompression {
    public static int compress(char[] chars){
        int index = 0;
        int i = 0;
        int n = chars.length;

        while(i<n){
            char curr = chars[i];
            int count = 0;

            while(i<n && chars[i] == curr){
                count++;
                i++;
            }
            chars[index++] = curr;
            if(count>1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[index++]=c;
                }
            }
        }

        return index;
    }
}

