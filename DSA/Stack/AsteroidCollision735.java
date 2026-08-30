package DSA.Stack;
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack();
        boolean shouldPush = true;

        for(int i = 0; i < a.length; i++){
            shouldPush = true;
            while(!st.isEmpty()){
                int peek = st.peek();
                if(peek > 0 && peek == a[i] * -1){
                    st.pop();
                    shouldPush = false;
                    break;
                }
                else if(peek == a[i] || peek * a[i] > 0 || (peek < 0 && a[i] > 0)){
                    break;
                }
                else if(Math.abs(peek) > Math.abs(a[i])){
                    shouldPush = false;
                    break;
                }
                else if(Math.abs(peek) < Math.abs(a[i])){
                    st.pop();
                }
            }
        
            if(shouldPush){
                st.push(a[i]);
            }
        }

        int[] arr = new int[st.size()];
        int j = 0;
        for(int i : st){
            arr[j++] = i;
        }

        return arr;
    }
}