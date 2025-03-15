package problem75LC;

public class ReverseWords {
    public static String reverseWords(String s){
        String[] arr = s.trim().split("//s+");
        int l = 0, r = arr.length-1;
        while (l<=r) {
            String temp =  arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(String.join(" ", arr));
    }
    public static void main(String[] args) {
        String s = "nigga with a gyatt is picking cotton";
        System.out.println(reverseWords(s));
    }
}
