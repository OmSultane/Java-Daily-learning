package DSA.Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfMultipleArrays2248 {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] arr : nums) {
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == nums.length) {
                ans.add(key);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}