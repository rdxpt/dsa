package problem75LC;

import java.util.List;
import java.util.ArrayList;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int start = nums[i];
            while(i+1<nums.length && nums[i+1] - 1 == nums[i])i++;
            if(nums[i]==start)result.add((String.valueOf(nums[i])));
            else result.add((String) (start + "->" +nums[i]));
            i++;
        }
        return result;
    }
}
