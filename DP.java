public class DP{
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int left = fib(n-1);
        int right = fib(n-2);
        return left+right;
    }
    public static int fibDPBottomUp(int n){
        int[] table = new int[n+1];
        table[0]=0;
        table[1]=1;
        for(int i=2; i<=n; i++){
            table[i] = table[i-1]+table[i-2];
        }
        return table[n];
    }

    public int fibDPTopDown(int[] memo, int n){
        if(memo[n] == 0){
            if(n<2)memo[n] = n;
            else{
                int left = fibDPTopDown(memo, n-1);
                int right = fibDPTopDown(memo, n-2);
                memo[n] = left+right;
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}