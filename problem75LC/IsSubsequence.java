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
}
