
public class RemoveDigitFromNumbertoMaximizeResult {
    public static String removeDigit(String number, char digit) {
        int lastSeenIndex = -1;
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i)==digit){
                lastSeenIndex = i;
                if(lastSeenIndex==0 && number.length()==1) return null;
                if(number.charAt(i)<number.charAt(i+1)){
                    return number.substring(0, lastSeenIndex)+number.substring(lastSeenIndex+1);
                }
            }
        }
        return number.substring(0, lastSeenIndex)+number.substring(lastSeenIndex+1);
    }
    public static void main(String[] args) {
        String number = "5";
        char digit = '5';
        System.out.println(removeDigit(number, digit));
    }
}
