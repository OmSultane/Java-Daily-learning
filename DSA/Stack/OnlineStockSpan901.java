package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class StockSpanner {
    // Stores pairs of {price, span}
    private Deque<int[]> stack;

    public StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        
        // Pop elements while the stack top price is less than or equal to current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        
        // Push the current price and its accumulated span
        stack.push(new int[]{price, span});
        
        return span;
    }
}