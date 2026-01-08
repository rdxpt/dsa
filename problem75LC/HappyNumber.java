package problem75LC;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();
        map.add(n);
        return check(n, map);
    }
    public boolean check(int num, Set<Integer> map){
        int sumOfSq = sumOfSqOfDigits(num);

        if(sumOfSq == 1) return true;
        if(sumOfSq<10) return false;


        if(map.contains(sumOfSq)) return false;
        else{
            map.add(sumOfSq);
            return check(sumOfSq, map);
        }
    }
    public int sumOfSqOfDigits(int num){
        int size = Integer.toString(num).length();
        int sumOfSq = 0;
        for(int i = 0; i<size; i++){
            sumOfSq += i*i;
        }
        return sumOfSq;
    }
    public static void main(String[] args) {
        
    }
}
