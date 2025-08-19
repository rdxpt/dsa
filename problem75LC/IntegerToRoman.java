package problem75LC;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] arr = {1000, 500, 100, 50, 10, 5, 1};
        Map<Integer, Character> map = new HashMap<>();
        map.put(1000, 'M');
        map.put(500, 'D');
        map.put(100, 'C');
        map.put(50, 'L');
        map.put(10, 'X');
        map.put(5, 'V');
        map.put(1, 'I');
        for(int i: arr){
            while(num>i){
                sb.append(map.get(i));
                num -=i;
            }
            
        }
        return sb.toString();
    }
}
