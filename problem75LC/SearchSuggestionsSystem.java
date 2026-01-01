package problem75LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result = new ArrayList<>();

        int left = 0;
        int right = products.length-1;

        for(int i=1; i<searchWord.length(); i++){
            char c = searchWord.charAt(i);
            while(left<=right && (products[left].length()<=i || products[left].charAt(i)!=c)){
                left++;
            }
            while(left<=right && (products[right].length()<=i || products[right].charAt(i)!=c)){
                right--;
            }
            List<String> suggestions = new ArrayList<>();
            for(int j=left; j<=right && j <left+3; j++){
                suggestions.add(products[j]);
            }
            result.add(suggestions);
        }
        
        return result;
    }
    /*
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        List<List<String>> result = new ArrayList<>();

        for(int i=1; i<searchWord.length(); i++){
            String prefix = searchWord.substring(0, i);
            List<String> currentSuggestions = new ArrayList<>();

            for(String product : products){
                if(product.startsWith(prefix)){
                    currentSuggestions.add(product);
                    if(currentSuggestions.size()==3)break;
                }
            }
            result.add(currentSuggestions);
        }
        return result;
    }
    */
}
