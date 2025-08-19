package problem75LC;

public class ZeroFilledSubarrays {
    public static int zeroFilledSubarrays(int[] nums){
        long res = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                int count = 1;
                i++;
                while(i<nums.length && nums[i]==0){
                    count++;
                    i++;
                }
                res += (long) count*(count+1)/2;
            }
        }
        return res;
    }
}
