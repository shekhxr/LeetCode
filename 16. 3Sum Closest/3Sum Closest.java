class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }

        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for(int i=0;i<nums.length-2;i++) {
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r) {
                int currentSum = nums[i] + nums[l] + nums[r];
                if(Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                if(currentSum < target) {
                    l++;
                } else if(currentSum > target){
                    r--;
                } else {
                    // Current sum equals target exactly, return immediately
                    return currentSum;
                }
            }
        }

        return closestSum;
    }
}
