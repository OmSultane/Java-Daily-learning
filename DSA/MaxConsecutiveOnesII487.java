package DSA;

public class MaxConsecutiveOnesII487 {
    public int findMaxConsecutiveOnes(int[] nums){
        
        int left = 0;
        int ans = 0;
        int window = 0;

        for(int right = 0; right<nums.length; right++){
            window += nums[right];

            while(!(window == left+right-1 || window == right-left)){
                window -= nums[left];
                left++;
            }

            ans = Math.max(ans, left+right-1);
        }
        
        return ans;
    }
}
