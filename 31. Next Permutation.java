class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = nums.length - 2;

        if(nums.length == 0 || nums == null) {
            return;
        }

        for(int i=nums.length-1;i>0;i--) {
            if(nums[i-1] >= nums[i]) {
                idx1--;
            } else {
                break;
            }
        }

        if(idx1 == -1) {
            reverse(nums, 0, nums.length-1);
        } else {
            for(int i=nums.length-1;i>0;i--) {
                if(nums[i] > nums[idx1]) {
                    int temp = nums[i];
                    nums[i] = nums[idx1];
                    nums[idx1] = temp;
                    break;
                }
            }
            reverse(nums, idx1+1, nums.length-1);
        }
    }

    void reverse(int nums[], int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
