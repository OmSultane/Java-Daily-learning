package DSA.Stack;
import java.util.Stack;

class solution{
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        int k = -1; 
        // Stack<Integer> st = new Stack();

        for(int i = 0; i < pushed.length; i++){
            // st.push(pushed[i]);
            pushed[++k] = pushed[i];
            while(k > -1 && popped[j] == pushed[k]){
                k--;
                j++;
            }
        }
        
        return k==-1;
    }
}