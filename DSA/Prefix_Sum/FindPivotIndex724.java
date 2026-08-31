package DSA.Prefix_Sum;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;

        for(int i : nums){
            sum = sum + i;
        }

        for(int i = 0; i < nums.length; i++){
            sum = sum - nums[i];

            if(sum == leftSum){
                return i;
            }

            leftSum = leftSum + nums[i];
        }

        return -1;
    }
}