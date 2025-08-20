class Solution {
    public long continuousSubarrays(int[] nums) {
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int left = 0; 
        long count = 0;

        for (int right = 0; right < nums.length; right++) {
            // Maintain maxDeque (decreasing)
            while (!maxDeque.isEmpty() && nums[right] > maxDeque.peekLast()) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(nums[right]);

            // Maintain minDeque (increasing)
            while (!minDeque.isEmpty() && nums[right] < minDeque.peekLast()) {
                minDeque.pollLast();
            }
            minDeque.addLast(nums[right]);

            // If window becomes invalid, shrink from left
            while (maxDeque.peekFirst() - minDeque.peekFirst() > 2) {
                if (nums[left] == maxDeque.peekFirst()) maxDeque.pollFirst();
                if (nums[left] == minDeque.peekFirst()) minDeque.pollFirst();
                left++;
            }
            
            // Count all valid subarrays ending at right
            count += right - left + 1;
        }

        return count;
    }
}
