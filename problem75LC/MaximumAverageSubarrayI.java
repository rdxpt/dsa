package problem75LC;

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k){
        double sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double maxAvg = sum/k;
        for(int i=k; i< nums.length-k; i++){
            sum = sum - nums[i-k] + nums[k];
            if(sum/k>maxAvg) maxAvg=sum/k;
        }
        return maxAvg;
    }
}
