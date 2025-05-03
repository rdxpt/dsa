package problem75LC;

import java.util.List;
import java.util.Stack;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = stack.pop();
            visited[v] = true;
            for(int w : rooms.get(v)){
                if(!visited[w])stack.push(w);
            }
        }
        for(boolean b : visited){
            if(b==false)return false;
        }

        return true;
    }

}