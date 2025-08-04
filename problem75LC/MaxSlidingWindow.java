package problem75LC;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxSlidingWindow {
    public static List<Integer> maxSlidingWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            int maxIndex = i;
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > arr[maxIndex]) {
                    maxIndex = i + j;
                }
            }
            result.add(arr[maxIndex]);
        }
        return result;
    }
    public static List<Integer> maxSlidingWindowII(int[] arr, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for(int i=0; i<arr.length; i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>k-1){
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }
}
