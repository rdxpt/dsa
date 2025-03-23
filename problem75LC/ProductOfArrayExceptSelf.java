package problem75LC;

public class ProductOfArrayExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int n = nums.length;
        int zero = 0;
        int[] res = new int[n];
        for(int i : nums){
            if(i==0){
                zero++;
                continue;
            }
            product *= i;
        }
        
        if(zero==0){
            for(int i=0; i<n; i++) res[i] = product/nums[i];
        } else if (zero == 1){
            for(int i=0; i<n; i++) res[i] = (nums[i]==0) ? product : 0; 
        } else {
            for(int i=0; i<n; i++)res[i] = 0;
        }

        return res;
    }
}