import java.util.List;
import java.util.Comparator;
import java.util.LinkedList;


public class Interval {
    private int start;
    private int end;

    public Interval(int start, int end){
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        Interval interval = new Interval(10, 15);
    }

    public List<Interval> merge(List<Interval> intervals){
        if(intervals.size()<2)return intervals;

        intervals.sort(Comparator.comparingInt(in -> in.start));

        List<Interval> result = new LinkedList<>();

        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;

        for(int i=1; i<intervals.size(); i++){
            Interval current = intervals.get(i);
            if(current.start<=end) end = Math.max(current.end, end);
            else{
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }

    public static List<Interval> insert(Interval newInterval, List<Interval> intervals){
        if(intervals==null || intervals.isEmpty())return intervals;
        List<Interval> result = new LinkedList<>();
        int i=0;

        while(i<intervals.size() && intervals.get(i).end<newInterval.start){
            result.add(intervals.get(i));
            i++;
        }

        while(i<intervals.size() && intervals.get(i).start <= newInterval.end){
            newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
        }
        result.add(newInterval);

        while(i<intervals.size()){
            result.add(intervals.get(i));
            i++;
        }

        return result;
    }
}
