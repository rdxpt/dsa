package problem75LC;

import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            while (!stack.isEmpty() && stack.peek() * i < 0) {
                if (Math.abs(stack.peek()) > Math.abs(i)) break;
                else if(Math.abs(stack.peek()) == Math.abs(i)){
                    stack.pop();
                    i=0;
                    break;
                }
                else {
                    stack.pop();
                }
            }
            if(i!=0)stack.push(i);
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++)
            res[i] = stack.get(i);
        return res;
    }
}
