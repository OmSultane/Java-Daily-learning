package DSA.Stack;

class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for(char i : s.toCharArray()){
            
            char peek = sb.length() > 0 ? sb.charAt(sb.length()-1) : '1';

            if(Math.abs(peek - i) == 32 && sb.length() > 0){
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(i);
            }
        }

        return sb.toString();
    }
}