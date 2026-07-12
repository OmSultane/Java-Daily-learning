package DSA.Hashing;
import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum930 {
    public int numsubarrayWithSum(int[] nums, int goal) {
        int res = 0;
        int ps = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);

        for(int i = 0; i < nums.length; i++){
            ps += nums[i];
            res += map.getOrDefault(ps-goal, 0);
            map.put(ps, map.getOrDefault(ps,0) + 1);
        }
        
        return res;
    }
}
