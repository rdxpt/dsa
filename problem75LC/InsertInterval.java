package problem75LC;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++){

            if((newInterval[0]>intervals[i][1]) || (newInterval[0] >= intervals[i][0] && newInterval[1] <= intervals[i][1])){
                res.add(intervals[i]);
            } else {
                int start = Math.min(newInterval[0], intervals[i][0]);
                int end = Math.max(newInterval[1], intervals[i][1]);
                
                while(end > intervals[i+1][0]){
                    end = Math.max(intervals[i+1][1], end);
                    i++;
                }

                res.add(new int[] {start, end});
            }
        }

        return res.toArray(new int[res.size()][2]);
    }
}
