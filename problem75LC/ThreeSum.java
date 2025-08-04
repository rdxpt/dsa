package problem75LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void threeSum(int[] arr, int target){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int j=i+1;
            int k = arr.length-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==target){
                    System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
                    j++;
                    k--;
                }
                if(sum>target)k--;
                if(sum<target)j++;
            }
        }
    }

    public List<List<Integer>> three3Sum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                } else if(sum>target)k--;
                else j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 1, 0};
        int target = 6;
        threeSum(arr, target);
    }
}
