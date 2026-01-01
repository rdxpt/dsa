package problem75LC;

import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
       // 1. MUST be long to hold the sum of large integers
        long sum = 0; 
        long min = arr.get(0);
        long max = arr.get(0);
        
        for(int i : arr){
            sum += i;
            if(i > max) max = i;
            if(i < min) min = i;
        }
        
        // 2. The math is now safe from overflow
        System.out.println((sum - max) + " " + (sum - min));
    }
}
