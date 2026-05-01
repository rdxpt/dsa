package problem75LC;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) return s;
        StringBuilder sb = new StringBuilder();
        int x = (numRows-1)*2;
        int y = 0;
        for(int i = 0; i < numRows; i++){
            if(x<0) break;
            int pos = i;
            sb.append(s.charAt(pos));
            boolean flag = true;
            while(pos<s.length()){
                int factor = (flag ? x : y);
                if(factor==0 ){
                    flag = !flag;
                    continue;
                } else if(pos+factor >= s.length()) break;
                else {
                    pos +=factor;
                    sb.append(s.charAt(pos));
                    flag = !flag;
                }
            };
            x -=2 ;
            y +=2 ;
        }
        return sb.toString();
    }
}
