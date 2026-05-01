package problem75LC;

import java.util.ArrayList;
import java.util.List;

public class CheckDigitorialPermutation {
    public boolean isDigitorialPermutation(int n) {
        if(n == 0) return false;

        List<Integer> list = new ArrayList<>();
        int n_copy = Integer.valueOf(n);
        int sum = 0;

        while(n_copy != 0){
            int num = n_copy%10;
            sum += factorial(num);
            list.add(num);
            n_copy = n_copy/10; 
        }

        while(sum != 0){
            int num = sum%10;
            if(list.contains(num)){
                list.remove(Integer.valueOf(num));
            } else return false;
            sum = sum/10;
        }

        return list.isEmpty();
    }
    public static int factorial(int n){
        if(n == 0) return 1;
        else return n * factorial(n-1);
    }
}
