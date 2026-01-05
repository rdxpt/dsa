package problem75LC;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxCount = 0;
        for(int i=1; i<nums.length; i++){
            int currentCount = 0;
            while(nums[i]==nums[i-1]){
                currentCount++;
                i++;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
    public int majorityElementVotingAlgo(int[] nums){  //Boyer-Moore Voting Algorithm
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0) candidate = num;
            if(num == candidate) count++;
            else count--;
        }
        return 0;
    }
}
