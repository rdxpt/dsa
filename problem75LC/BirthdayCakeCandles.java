package problem75LC;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int max = candles.get(0);
        for(int i : candles){
            if(i>max){
                count = 1;
                max = i;
                continue;
            } else if(i == max) count++;
        }
        return count;
    }
}
