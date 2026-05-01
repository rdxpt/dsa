package problem75LC;

public class MinimumCOstToSplitIntoOnes {
    public static int minCost(int n) {
        if(n == 1) return  0;
        if(n == 2) return 1;

        if(n%2 == 0) return (n*n)/(4) + (2 * minCost(n/2));
        else return (n-1) + minCost(n-1);
    }
    public static void main(String[] args) {
        System.out.println(minCost(6));
    }
}
