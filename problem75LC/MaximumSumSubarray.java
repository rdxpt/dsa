package problem75LC;

public class MaximumSumSubarray {
    public static int maxSumSubarray(int[] nums){
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            sum += nums[i];
            if(sum<nums[i])sum = nums[i];
            if(sum>maxSum) maxSum = sum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumSubarray(nums));
    }
}
