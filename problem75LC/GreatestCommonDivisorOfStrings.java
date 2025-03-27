package problem75LC;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfString(String str1, String str2){
        if(!(str1+str2).equals(str2+str1))return "";
        int len1 = str1.length();
        int len2 = str2.length();
        while(len2!=0){
            int temp = len1;
            len1 = len2;
            len2 = temp % len2;
        };
        return str1.substring(len1);
    }
    public static void main(String[] args) {
        
    }
}
