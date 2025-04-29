package problem75LC;

public class LongestSubArrayOf1 {
    public int longestSubArray(int[] nums){
        int maxLength = 0;
        int left = 0;
        int zeroes = 0;

        for(int right = 0; right<nums.length; right++){
            if(nums[right]==0)zeroes++;
            while(zeroes>1){
                if(nums[left]==0)zeroes--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left);
        }

        return maxLength;
    }
}
