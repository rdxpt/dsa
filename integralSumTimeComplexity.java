public class integralSumTimeComplexity {

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println(sumAlgo1(999999));
        System.out.println("Time Taken : "+(System.currentTimeMillis()-now)+" ms");
        now = System.currentTimeMillis();
        System.out.println(sumAlgo2(999999));
        System.out.println("Time Taken : "+(System.currentTimeMillis()-now)+" ms");
    }

    public static int sumAlgo1(int n){
        return n*(n+1)/2;
    }

    public static int sumAlgo2(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}