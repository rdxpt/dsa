package problem75LC;

import java.util.Arrays;

public class GreatesSumDivisibleByThree{
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[] {0, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for(int num : nums){
            int[] nextDP = dp.clone();

            for(int s : dp){
                if(s == Integer.MIN_VALUE)
            }
        }
        return dp[0];
    }
}