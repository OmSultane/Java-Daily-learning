package DSA.Hashing;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences1941 {
    public boolean areOccurrencesEqual(String s) {
        int res = 0;
        int[] arr = new int[26];

        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }

        int x = 0;
        for(int c : arr){
            if(c != 0 && x == 0){
                x = c;
            }
            else if(c != 0){
                if(c != x){
                    return false;
                }
            }
        }
        return true;
    }
}
