/**
 * C ou po nC od eV al id at or
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CouponCodeValidator {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> result = new ArrayList<>();
        List<String[]> valid = new ArrayList<>();
        Map<String, Integer> map = Map.of(
            "electronics", 0,
            "grocery", 1,
            "pharmacy", 2,
            "restaurat", 3
        );

        for(int i=0; i< code.length; i++){
            if(
                code[i] !=null && !code[i].isEmpty() &&
                code[i].matches("[a-zA-Z0-9_]+") &&
                isActive[i] &&
                map.containsKey(businessLine[i])
            ){
                valid.add(new String[] {businessLine[i], code[i]});
            }
        }

        valid.sort((a, b)->{
        int cat =  Integer.compare(map.get(a[0]), map.get(b[0]));
        return cat != 0 ? cat : a[1].compareTo(b[1]);
        });

        return result;
    }
}

