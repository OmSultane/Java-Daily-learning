package DSA.Stack;
import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack();

        for(String i : arr){
            if(i.equals("..") && !stack.empty()){
                stack.pop();

            }else if(!i.equals(".") && !i.equals("..") && !i.equals("")){
                stack.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(String s: stack){
            sb.append("/");
            sb.append(s);
        }
        return sb.length() == 0 ? "/" : sb.toString() ;
    }
}