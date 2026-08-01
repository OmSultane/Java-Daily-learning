package DSA.Stack;
import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack();
        Stack<Character> tt = new Stack();

        for(char i : s.toCharArray()){
            if(i == '#'){
                if(!st.empty())
                    st.pop();
            }else{
                st.push(i);
            }
        }
        for(char i : t.toCharArray()){
            if(i == '#'){
                if(!tt.empty())
                    tt.pop();
            }else{
                tt.push(i);
            }
        }

        return st.equals(tt);
    }
}