package problem75LC;
import java.util.*;

public class FindDifference {

    public static boolean contains(int[] list, int num){
        for(int i : list){
            if(i==num) return true;
        }
        return false;
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int num : nums1){
            if(!contains(nums2, num) && !list1.contains(num)){
                list1.add(num);
            }
        }
        for(int num : nums2){
            if(!contains(nums1, num) && !list2.contains(num)){
                list2.add(num);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);

        return res;
    }

    public static List<List<Integer>> findDiff(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) list1.add(num);
        }

        for (int num : set2) {
            if (!set1.contains(num)) list2.add(num);
        }

        return Arrays.asList(list1, list2);
    }

}
