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
