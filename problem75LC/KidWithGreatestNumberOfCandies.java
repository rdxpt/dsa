package problem75LC;

import java.util.List;
import java.util.ArrayList;

public class KidWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> res = new ArrayList<>();
        int n = candies.length;
        for(int i=0; i<n; i++){
            if(candies[i]>max)max=candies[i];
        }
        for(int i=0; i<n; i++){
            if(candies[i]+extraCandies>=max)res.add(true);
            else res.add(false);
        }
        return res;
    }
}
