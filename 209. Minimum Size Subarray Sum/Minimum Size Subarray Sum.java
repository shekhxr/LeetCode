class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for(int end=0;end<nums.length;end++) {
            sum += nums[end];

            // Shrink window as long as the condition is met
            while(sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }

            // Early break if minLen is 1 (smallest possible)
            if(minLen == 1) {
                return 1;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
