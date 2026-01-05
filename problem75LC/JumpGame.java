package problem75LC;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGame {
    public boolean canJumpBFS(int[] nums) {
        int n = nums.length;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.offer(0);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            if(curr+nums[curr]>=n-1) return true;
            for(int i=curr+1; i<=curr+nums[curr]; i++){
                if(!visited[i]){
                    queue.offer(i);
                    visited[i]=0;
                }
            }
        }
        return false;
    }

    public boolean canJumpGREEDY(int[] nums){
        int reachable = 0;
        for(int i=0; i<nums.length; i++){
            if(i>reachable) return false;
            reachable = Math.max(reachable, i+nums[i]);
            if(reachable>=n-1) return true;
        }
    }
}
