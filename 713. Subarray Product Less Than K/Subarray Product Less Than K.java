class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;  // No products less than 1 possible for positive nums
        }
        
        int left = 0;
        int count = 0;
        int product = 1;

        for(int right=0;right<nums.length;right++) {
            product *= nums[right];

            while(product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
