package problem75LC;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int x,y;
        int minutes = 0;
        int[][] directions = new int[][] {{0,1}, {0,-1}, {1,0}, {-1,0}};
        Set<int[]> hashset = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(grid[i][j]==2) queue.offer(new int[] {i,j});
                else if(grid[i][j]==1)hashset.add(new int[] {i, j});
            }
        }
        
        while(!queue.isEmpty()){
            minutes++;
            int n = queue.size();
            
            for(int i=0; i<n; i++){
                int[] current = queue.poll();
                for(int[] direction : directions){
                    x = current[0] + direction[0];
                    y = current[1] + direction[1];

                    if( x<0 || x>=rows || y<0 || y>=columns || grid[x][y]==0 || grid[x][y]==2) continue;

                    grid[x][y] = 2;
                    int[] curr = new int[] {x, y};
                    queue.offer(curr);
                    hashset.remove(curr);
                }
            }
        }

        return hashset.isEmpty() ? minutes : -1;
    }
}
