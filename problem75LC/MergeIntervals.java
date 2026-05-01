package problem75LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals{
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> segments = new ArrayList<>();

        int start = intervals[0][0], end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            } else {
                segments.add(new int[] {start, end});
                start = intervals[i][0];
                end = intervals[i][1]; 
            }
        }
        segments.add(new int[] {start, end});

        return segments.toArray(new int[segments.size()][2]);
    }
}