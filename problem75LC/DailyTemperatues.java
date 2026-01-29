/**
 * D ai ly Te mp er at ue s
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

import java.util.Stack;

public class DailyTemperatues {
    public int[] dailyTemperatures_on2(int[] temperatures){
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            int counter = 0;
            for(int j = i+1; j<n; j++){
                counter++;
                if(temperatures[j]>temperatures[i]){
                    res[i] = counter;
                    break;
                }
            }
        }
        return res;
    }
    public int[] dailyTemperatures_on1(int[] temperatures){
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index = stack.pop();
                res[index] = i-index;
            }
            stack.push(i);
        }
        return res;
    }
}

