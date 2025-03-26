package problem75LC;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums){
        int leftSum=0;
        int rightSum=0;
        int n=nums.length;
        for(int i : nums){
            rightSum+=i;
        }
        for(int i=0; i<nums.length; i++){
            if(i!=0)leftSum+=nums[i-1];
            if(i!=n-1)rightSum-=nums[i];
            if(i==n-1)rightSum=0;
            if(leftSum==rightSum)return i;
        }
        return -1;
    }
}
