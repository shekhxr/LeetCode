class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = Long.MIN_VALUE;
        long prefixSum = 0;
        // Store the minimal prefix sum seen BEFORE any occurrence of nums[i]
        Map<Integer, Long> minPrefixBefore = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            // Check subarrays where current is the last value and first value = current - k
            if (minPrefixBefore.containsKey(current - k)) {
                maxSum = Math.max(maxSum, prefixSum + current - minPrefixBefore.get(current - k));
            }
            // ...or first value = current + k
            if (minPrefixBefore.containsKey(current + k)) {
                maxSum = Math.max(maxSum, prefixSum + current - minPrefixBefore.get(current + k));
            }
            // Before counting current, store the minimum prefix sum for its value
            minPrefixBefore.merge(current, prefixSum, Math::min);
            // Advance prefix sum
            prefixSum += current;
        }
        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}
