/**
 * G as St at io n
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

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentFuel = 0;
        int startNode = 0;

        for(int i=0; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];

            currentFuel += gas[i] - cost[i];
            
            if(currentFuel < 0){
                startNode = i+1;
                currentFuel = 0;
            }
        }

        return (totalGas < totalCost) ? -1 : startNode; 
    }
}

