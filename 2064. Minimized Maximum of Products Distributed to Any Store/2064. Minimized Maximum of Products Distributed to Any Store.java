class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int max = Integer.MIN_VALUE;
        for(int quantity : quantities) max = Math.max(max, quantity);

        int low = 1, high = max;
        while(low < high) {
            int mid = low + (high - low) / 2;

            int stores = 0;
            for(int i=0;i<quantities.length;i++) {
                if(quantities[i] % mid == 0) stores += quantities[i] / mid;
                else stores += (quantities[i] / mid) + 1;
            }

            if(stores <= n) high = mid;
            else low = mid + 1;
        }

        return low;
    }
}
