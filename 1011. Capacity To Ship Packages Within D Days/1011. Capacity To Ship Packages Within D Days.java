class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int weight : weights) {
            sum += weight;
            max = Math.max(max, weight);
        }

        int low = max, high = sum;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int load = 0, currDays = 1;

            for (int weight : weights) {
                if (load + weight <= mid) {
                    load += weight;
                } else {
                    load = weight;
                    currDays++;
                }
            }

            if (currDays <= days) {
                high = mid;
            } else
                low = mid + 1;
        }

        return low;
    }
}
