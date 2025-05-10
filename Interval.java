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
}
