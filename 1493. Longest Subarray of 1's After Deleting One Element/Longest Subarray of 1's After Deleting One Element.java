class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, maxLength = 0;
        int zero = 0;

        for(int right=0;right<nums.length;right++) {
            if(nums[right] == 0) {
                zero++;
            }

            while(zero > 1) {
                if(nums[left] == 0) {
                    zero--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength - 1; // Because problem expects length after deleting one element
    }
}
