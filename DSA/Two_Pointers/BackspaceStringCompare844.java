package DSA.Two_Pointers;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;
        int sSkip = 0;
        int tSkip = 0;

        while(i >= 0 || j >= 0){
            while(i >=0 && (s.charAt(i) == '#' || sSkip > 0)){
                if(s.charAt(i) == '#'){
                    sSkip++; i--;
                }
                else{
                    i--; sSkip--;
                }
            }
            while(j >=0 && (t.charAt(j) == '#' || tSkip > 0)){
                if(t.charAt(j) == '#'){
                    tSkip++;j--;
                }
                else{
                    j--; tSkip--;
                }
            }

            if((i >=0 && j < 0) || (j >=0 && i < 0)){
                return false;
            }

            if(i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)){
                return false;
            }
            i--;j--;
        }
        return true;
    }
}