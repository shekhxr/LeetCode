class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int i = nums.length - 1;

        while(l <= r) {
            if(Math.abs(nums[l]) > Math.abs(nums[r])) {
                result[i] = nums[l] * nums[l];
                l++;
            } else {
                result[i] = nums[r] * nums[r];
                r--;
            }
            i--;
        }
        return result;
    }
}
