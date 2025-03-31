package problem75LC;

public class MaximumNumberOfVowelsInSubstring {
    public static int maxVowels(String s, int k){
        char[] sArray = s.toCharArray();
        int maxCounter = 0, currentCounter = 0;
        for(int v=0; v<k; v++){
            if("aeiouAEIOU".indexOf(sArray[v])!=-1){
                currentCounter++;
            }
        }
        maxCounter = currentCounter;

        for(int i=k; i<sArray.length; i++){
            if("aeiouAEIOU".indexOf(sArray[i-k])!=-1)currentCounter--;
            if("aeiouAEIOU".indexOf(sArray[i])!=-1)currentCounter++;
            if(currentCounter>maxCounter)maxCounter=currentCounter;
        }
        return maxCounter;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("leetcode", 3));
    }
}
