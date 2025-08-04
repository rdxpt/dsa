package problem75LC;

public class RemoveElement {
    public static int removeElementI(int[] nums, int val){
        int i=0, j=nums.length-1;
        while(i<=j){
            if(nums[i]==val){
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }

        }
        return j+1;
    }
    public static int removeElementII(int[] nums, int val){
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[i]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
