package DSA.Stack;

class Solution {
    public String removeStars(String s) {
    //    StringBuilder sb = new StringBuilder();

    //    for(int i = 0; i < s.length(); i++){
    //         if(s.charAt(i) == '*'){
    //             sb.deleteCharAt(sb.length()-1);
    //         }else{
    //             sb.append(s.charAt(i));
    //         }
    //     }
    //     return sb.toString();

        int i = 0;
        char []arr = new char[s.length()];
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == '*'){
                i--;

            }else{
                arr[i] = s.charAt(j);
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < i; k++){
            sb.append(arr[k]);
        }

        return sb.toString();
    }
}