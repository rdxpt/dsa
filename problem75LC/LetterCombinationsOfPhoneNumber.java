package problem75LC;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();

        String[] mapping = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        List<String> res = new ArrayList<>();
        backtrack(res, digits, mapping, new StringBuilder(), 0);
        return res;
    }
    private void backtrack(List<String> res, String digits, String[] mapping, StringBuilder current, int index){
        if(index == digits.length()){
            
        }
    }
}
