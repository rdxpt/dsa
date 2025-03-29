package problem75LC;

import java.util.Arrays;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h){
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        while(left<right){
            int mid = left+(right-left)/2;
            int hours = getTotalHours(piles, mid);
            if(hours <= h) right = mid;
            else left = mid+1;
        }
        return left;
    }
    public static int getTotalHours(int[] piles, int k){
        int hours = 0;
        for(int pile : piles){
            hours += (pile+k-1)/k;
        }
        return hours;
    }
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] {3,6,7,11}, 8));
    }
}
