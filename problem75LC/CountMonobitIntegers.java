package problem75LC;

public class CountMonobitIntegers {
    public static int countMonobit(int n) {
        if(n==0) return 1;
        int count = 1;
        int sum = 0;
        int i = 0;

        while(sum<=n){
            sum += (int) Math.pow(2, i);
            if(!(sum <= n))return count;
            count++;
            i++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countMonobit(1));
    }
}
