/**
 * L ar ge st Al ti tu de
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
public class LargestAltitude{
    public static int largestAltitude(int[] gain){
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int alt = 0, maxalt = 0;

        for(int i = 0; i<gain.length; i++){
            alt += gain[i];
            altitude[i+1] = alt;
            if(altitude[i+1]>maxalt) maxalt = altitude[i+1]; 
        }
        return maxalt;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
