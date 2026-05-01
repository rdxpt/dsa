package problem75LC;

public class Demo {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        System.out.println("prefix: "+ prefix);
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                System.out.println("prefix: "+ prefix);
                System.out.println("word: "+strs[i]);
                if(prefix == "") return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[] {"flower","flow","flight"});
    }
}
