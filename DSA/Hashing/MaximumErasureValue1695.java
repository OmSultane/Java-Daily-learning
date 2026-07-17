package DSA.Hashing;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue1695{
    public int maximumUniqueSubarray(int[] nums) {
        
        int res = 0, sum = 0, left = 0;
        Set<Integer> set = new HashSet();

        for(int right = 0; right < nums.length; right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            sum += nums[right];
            set.add(nums[right]);
            res = Math.max(sum, res);
        }

        return res;
    }
}