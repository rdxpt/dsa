package problem75LC;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] arr = Integer.toString(x).toCharArray();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]!=arr[n-i-1]){
                return false;
            }
        }
        return true;
    }
}
