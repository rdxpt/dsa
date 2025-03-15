package problem75LC;

public class ReverseVowels {
    public String reverseVowels(String s){
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length-1;
        String vowels = "aeiouAEIOU";

        while(l<r){
            while(l<r && vowels.indexOf(arr[l])==-1)l++;
            while(l<r && vowels.indexOf(arr[r])==-1)r--;
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++; r--;
        }

        return new String(arr);
    }
}