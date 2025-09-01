class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        for(int i = 1; i <= nums.length; i++) {
            xor1 = xor1 ^ i;
        }
        
        int xor2 = 0;
        for(int num : nums) {
            xor2 = xor2 ^ num;
        }

        return xor1 ^ xor2;
    }
}
