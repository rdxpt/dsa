package problem75LC;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            int val = getValue(s.charAt(i));
            if(i + 1 < s.length() && val < getValue(s.charAt(i+1))){
                result -= val;
            } else {
                result += val;
            }
        }

        return result;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
