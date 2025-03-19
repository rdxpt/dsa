package problem75LC;

import java.util.Arrays;

public class KSumPairs {
    public static int kSumPairs(int[] nums, int k){
        int counter = 0;
        Arrays.sort(nums);
        int n= nums.length;
        int i=0, j=n-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == k){
                counter++;
                i++; j--;
            } else if(sum<k){
                i++;
            } else if(sum>k){
                j--;
            }
        }
        return counter;
    }

}
