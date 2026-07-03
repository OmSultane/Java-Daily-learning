package DSA.Strings;

public class RansomNote383 {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for(char i : ransomNote.toCharArray()){
            arr[i - 'a']++;
        }
    
        for(char i : magazine.toCharArray()){
            arr[i - 'a']--;
        }

        for(int i : arr){
            if(i > 0){
                return false;
            }
        }

        return true;
        
    }
}