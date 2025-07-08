package problem75LC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i], i);
            } else {
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("No result found");
    }
    public static int[] twoSum2pointer(int[] nums, int target){
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        while(left>right){
            if(left+right==target)return new int[] {left, right};
            if(left+right<target)left++;
            if(left+right>target)right--;
        }
        throw new IllegalArgumentException("No result found");
    }
}
