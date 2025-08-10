class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int runLen[] = new int[n];
        runLen[0] = 1;
        for(int i=1;i<n;i++) {
            if(nums[i] == nums[i - 1] + 1) {
                runLen[i] = runLen[i - 1] + 1;
            } else {
                runLen[i] = 1;
            }
        }

        int result[] = new int[n - k + 1];
        
        for(int i=0;i<=n-k;i++) {
            int end = i + k - 1;
            result[i] = runLen[end] >= k ? nums[end] : -1;
        }

        return result;
    }
}
