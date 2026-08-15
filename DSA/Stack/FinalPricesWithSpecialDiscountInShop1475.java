package DSA.Stack;
import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        int []res = new int[prices.length];
        Stack<Integer> stack = new Stack();

        for(int i = 0; i < prices.length; i++){
            while(!stack.empty() && prices[stack.peek()] >= prices[i]){
                int idx = stack.pop();
                res[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
        }

        while(!stack.empty()){
            int idx = stack.pop();
            res[idx] = prices[idx];
        }
        
        return res;
    }
}