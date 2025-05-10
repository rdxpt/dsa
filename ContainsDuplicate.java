import java.util.HashSet;
import java.util.Set;

// complexity = nlog(n)

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]))return true;
            set.add(nums[i]);
        }
        return false;
    }
}
