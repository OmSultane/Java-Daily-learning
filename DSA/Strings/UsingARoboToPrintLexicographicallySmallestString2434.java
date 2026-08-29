package DSA.Strings;

import java.util.Arrays;
import java.util.Stack;

class solution {
    public String robotWithString(String s) {
       Stack<Character> t = new Stack();
       int n = s.length();
       char[] minSuffix = new char[n+1];
        StringBuilder paper = new StringBuilder();

        Arrays.fill(minSuffix, 'z');
        for(int i = n-1; i >= 0; i--){
            minSuffix[i] = (char) Math.min(minSuffix[i+1], s.charAt(i));
        }

        for(int i = 0; i < n; i++){
            t.push(s.charAt(i));
            while(!t.isEmpty() && t.peek() <= minSuffix[i+1]){
                paper.append(t.pop());
            }
        }

        return paper.toString();
    }
}
