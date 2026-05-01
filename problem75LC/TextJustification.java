package problem75LC;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while(i < words.length){
            int j = i + 1;
            int lineLength = words[i].length();
            while(j < words.length && lineLength + 1 + words[j].length() <= maxWidth){
                lineLength += 1 + words[j].length();
                j++;
            }

            StringBuilder sb = new StringBuilder();
            int count = j - i;

            if(j == words.length || count == 1){
                for(int k = i; k < j; k++){
                    sb.append(words[k]);
                    if(k<j-1) sb.append(" ");
                }
                while(sb.length() < maxWidth) sb.append(" ");
            } else {
                int totalSpace = maxWidth - (lineLength - count + 1);
                int spaceBetween = totalSpace / (count - 1);
                int extraSpace = totalSpace % (count - 1);

                for(int k = i; k<j; k++){
                    sb.append(words[k]);
                    if(k<j-1){
                        int spaces = spaceBetween + (k - i < extraSpace ? 1 : 0);
                        for(int s = 0; s < spaces; s++) sb.append(" ");
                    }
                }
            }
            res.add(sb.toString());
            i = j;
        }
        return res;
    }
    public static void main(String[] args) {
    }
}
