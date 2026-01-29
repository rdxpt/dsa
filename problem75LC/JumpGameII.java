/**
 * J um pG am eI I
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DSA
 */
package problem75LC;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameII {
    public int jumpBFS(int[] nums) {
        int n = nums.length;
        if(n==1)return 0;
        int jumps = 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.offer(0);
        while(!queue.isEmpty()){
            jumps++;
            int p = queue.size();
            for(int i=0; i<p; i++){
                int curr = queue.poll();
                if(curr+nums[curr]>=n-1) return jumps;
                for(int j=curr+1; j<=curr+nums[curr]; j++){
                    if(!visited[j]){
                        queue.offer(j);
                        visited[j] = true;
                    }
                }
            }
        }
        return jumps;
    }
    public int jumpGREEDY(int[] nums){
        int jumps = 0;
        int currentJumpEnd = 0;
        int farthest = 0;

        for(int i=0; i<nums.length; i++){
            farthest = Math.max(farthest, i+nums[i]);

            if(i==currentJumpEnd){
                jumps++;
                currentJumpEnd = farthest;
                if(currentJumpEnd >= nums.length-1) break;
            }
        }
        return jumps;
    }
}

