package problem75LC;

public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid<=high){
            if(nums[mid]==0){
                nums[mid] = nums[low];
                nums[low] = 0;
                mid++; low++;
            } else if(nums[mid] == 2){
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            } else{
                mid++;
            }
        }
    }
    private void swap(int x, int y, int[] nums){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
