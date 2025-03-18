package problem75LC;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2){
        int n1 = word1.length();
        int n2 = word2.length();
        int i=0, j=0, k=0;
        char[] res = new char[n1+n2];
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        while(i<n1 && j<n2){
            res[k++]=arr1[i++];
            res[k++]=arr2[j++];
        }
        while(i<n1){
            res[k++]=arr1[i++];
        }
        while(j<n2){
            res[k++]=arr2[j++];
        }

        return new String(res);
    }
}
