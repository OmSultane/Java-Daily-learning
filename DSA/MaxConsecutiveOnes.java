// package DSA;

// public class MaxConsecutiveOnes {
    
//     public int findMaxConsecutiveOnes(int[] nums) {

//         int count = 0;
//         int max = 0;

//         for (int num : nums) {

//             if (num == 1) {
//                 count++;
//                 max = Math.max(max, count);
//             } else {
//                 count = 0;
//             }
//         }

//         return max;
//     }
// }


package DSA;

public class MaxConsecutiveOnes {
    
    public int findMaxConsecutiveOnes(int[] nums) {

        int left = 0;
        int ans = -1;
        int window = 0;

        for(int right = 0; right<nums.length; right++){
            window = window+nums[right];

            while(right-left+1 != window){
                window -= nums[left];
                left++;
            }

            ans = Math.max(right-left+1, ans);
        }


        return ans;
    }
}