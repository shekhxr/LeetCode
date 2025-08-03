class Solution {
    public void sortColors(int[] nums) {
        int low = 0; // position to place the next 0
        int mid = 0; // current element
        int high = nums.length - 1; // position to place the next 2

        while(mid <= high) {
            if(nums[mid] == 0) {
                // Swap nums[low] and nums[mid], move low and mid forward
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                // 1 is in correct place, just move mid forward
                mid++;
            } else { // nums[mid] == 2
                // Swap nums[mid] and nums[high], move high backward
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                // Do NOT increment mid, need to check swapped value
            }
        }
    }
}
