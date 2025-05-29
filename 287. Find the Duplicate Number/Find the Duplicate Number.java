class Solution {
    public int findDuplicate(int[] nums) {
        //Step 1 - Initialize the pointers
        int slow = nums[0];
        int fast = nums[nums[0]];

        //Step 2 - Find the intersection 
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        //Step 3 - Find the entrance to the cycle
        slow = 0;
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
