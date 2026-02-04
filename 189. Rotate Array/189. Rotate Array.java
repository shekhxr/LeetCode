class Solution {
    public static void reverseArray(int nums[], int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++; right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        reverseArray(nums, 0, n - k - 1);
        reverseArray(nums, n - k, n - 1);
        reverseArray(nums, 0, n - 1);
    }
}
