class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int num : nums) max = Math.max(num, max);

        int low = 1, high = max;
    
        while(low < high) {
            int mid = low + (high - low) / 2;

            int sum = 0;
            for(int num : nums) {
                // Ceiling division: (num + mid - 1) / mid
                sum += (num + mid - 1) / mid;
            }

            if(sum <= threshold) {
                // mid could be the answer, so keep it in the range
                high = mid; 
            } else {
                // mid is too small, definitely move higher
                low = mid + 1;
            }
        }

        return low; // When low == high, we've found the smallest divisor
    }
}
