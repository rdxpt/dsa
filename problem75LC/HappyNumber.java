/**
 * H ap py Nu mb er
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DSA
 */
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

