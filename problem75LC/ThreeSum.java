/**
 * T hr ee Su m
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Hashing
 */
package problem75LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i< arr.length - 2; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;

            int j = i + 1;
            int k = arr.length-1;

            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    while(arr[j]==arr[j+1])j++;
                    while(arr[k]==arr[k-1])k--;
                    j++; k--;
                } else if(sum < 0) j++;
                else k--;
            }
        }
        return result;
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

