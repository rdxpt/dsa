package problem75LC;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k){
        int maxLen = 0, left = 0, zerosCount = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right]==0){
                zerosCount++;
            }
            while(zerosCount>k){
                if(nums[left]==0) zerosCount--;
                left++;
            }
            maxLen = Math.max(maxLen, left-right+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        
    }
}
