package problem75LC;

import java.util.Arrays;

public class CountPrimes {
    /*
     * public static int countPrimes(int n){
     * int count = 0;
     * for(int i=2; i<n; i++){
     * if(isPrime(n))count++;
     * }
     * return count;
     * }
     * public static boolean isPrime(int num){
     * for(int i=2; i<num; i++){
     * if(num%i==0) return false;
     * }
     * return true;
     * }
     */

    public static int countPrimes(int n) {
        Boolean[] isPrime = new Boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                for (int j=2; i * j < n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        int count = 0;
        for (boolean prime : isPrime) {
            if (prime)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
