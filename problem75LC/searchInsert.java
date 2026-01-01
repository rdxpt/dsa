package problem75LC;

public class searchInsert {
    public int searchInsertMethod(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int value = nums[mid];
            if(value == target) return mid;
            else if(value < target) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
}