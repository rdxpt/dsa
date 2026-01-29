package problem75LC;

import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {
    
    public int snakesAndLadders(int[][] board){
        int n = board.length;
        int target = n*n;

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[target+1];

        q.add(1);
        visited[1] = true;
        int moves = 0;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int curr = q.poll();
                if(curr == target) return moves;

                for(int dice = 1; dice <= 6; dice++){
                    int next = curr + dice;
                    if(next > target) break;
                    int[] coords = getRowCol(next, n);
                    int r = coords[0], c = coords[1];

                    int destination = board[r][c] == -1 ? next : board[r][c];
                    if(!visited[destination]){
                        q.add(destination);
                        visited[destination] = true;
                    }
                }
            }
            moves++;
        }
        return -1;
    }
    private int[] getRowCol(int curr, int n){
        int rowFromBottom = (curr - 1)/n;
        int row = n - 1 - rowFromBottom;

        int col = (curr - 1) % 2;
        if(row%2 != 0) col = n - 1 - col;

        return new int[] {row, col};
    }
}
