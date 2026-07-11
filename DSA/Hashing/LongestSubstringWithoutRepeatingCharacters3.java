package DSA.Hashing;

import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3{
    public int lengthOfLongestSubstring(String s){

        int res = 0, left = 0, right = 0;
        Map<Character, Integer> map = new HashMap();
        char[] arr = s.toCharArray();

        for(; right < arr.length; right++){
            int idx = map.getOrDefault(arr[right],-1);
            
            if(idx != -1){
                res = Math.max(res, right - 1 - left + 1);
                left = idx + 1;
            }

            map.put(arr[right], right);
        }

        return Math.max(res, right - 1 - left + 1);
    }
}