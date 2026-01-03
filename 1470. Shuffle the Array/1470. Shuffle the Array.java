class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int i = 0;
        int j = n;
        int k = 0;

        while(j < nums.length) {
            if(k % 2 == 0) {
                result[k++] = nums[i++];
            } else {
                result[k++] = nums[j++];
            }
        }

        return result;
    }
}
