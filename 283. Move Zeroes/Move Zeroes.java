class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        // Fill remaining positions with zeros
        while(idx < nums.length) {
            nums[idx] = 0;
            idx++;
        }
    }
}
