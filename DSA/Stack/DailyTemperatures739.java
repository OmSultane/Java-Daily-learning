package DSA.Stack;

import java.util.Stack;

class solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack();
        int[] res = new int[t.length];

        for(int i = 0; i < t.length; i++){
            while(!stack.empty() && t[stack.peek()] < t[i]){
                int pop = stack.pop();
                res[pop] = i - pop;
            }
            stack.push(i);
        }
        return res;
    }
}
