/**
 * D ot a2S en at e
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

import java.util.LinkedList;
import java.util.Queue;
public class Dota2Senate {
    public static String predictPartyVictory(String senate){
        Queue<Integer> radiQ = new LinkedList<>();
        Queue<Integer> direQ = new LinkedList<>();
        int n = senate.length();

        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R') radiQ.add(i);
            else direQ.add(i);
        }

        while(!radiQ.isEmpty() && !direQ.isEmpty()){
            int rIndex = radiQ.poll();
            int dIndex = direQ.poll();

            if(rIndex<dIndex)radiQ.add(rIndex+n);
            else direQ.add(dIndex+n);
        }

        return radiQ.isEmpty() ? "Dire" : "Radiant";
    }
}

