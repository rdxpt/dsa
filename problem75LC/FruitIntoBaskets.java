package problem75LC;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        if(fruits==null || fruits.length==0) return 0;

        int left = 0;
        int max = 0;

        Map<Integer, Integer> basket = new HashMap<>();

        for(int right =0; right<fruits.length; right++){
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1 );
            while(basket.size()>2){
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit)-1);
                if(basket.get(leftFruit)==0)basket.remove(leftFruit);
                left++;
            }
            max = Math.max(max, right-left+1);
        }

        return max;
    }
}
