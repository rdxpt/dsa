package problem75LC;

import java.util.LinkedList;
import java.util.Queue;
public class Dota2Senate {
    public static String predictPartyVictory(String senate){
        Queue<Integer> radiQ = new LinkedList<>();
        Queue<Integer> direQ = new LinkedList<>();
        int n = senate.length();

        for(int i=0; i<n; i++){
            if(senate.charAt(i)=='R') radiQ.add(i);
            else direQ.add(i);
        }

        while(!radiQ.isEmpty() && !direQ.isEmpty()){
            int rIndex = radiQ.poll();
            int dIndex = direQ.poll();

            if(rIndex<dIndex)radiQ.add(rIndex+n);
            else direQ.add(dIndex+n);
        }

        return radiQ.isEmpty() ? "Dire" : "Radiant";
    }
}
