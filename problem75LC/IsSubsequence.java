/**
 * I sS ub se qu en ce
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

public class IsSubsequence {
    public static Boolean isSubsequence(String s, String t){
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        int n = sA.length;
        int i = -1, j = -2;
        while(i<n){
            i +=1;
            j +=2;
            if(sA[i]!=tA[j]) return false;
        }
        return true;
    }
    public static Boolean isSubseq(String str, String seq){
        int i=0;
        int j=0;
        while(i<str.length() && j<seq.length()){
            if(str.charAt(i)==seq.charAt(j))j++;
            i++;
        }
        return j== seq.length();
    }
/*  this one is not about finding it in there, but like
 finiding a sequence in a string when we remove some
 charachters given the sequence remains intact  */
}

