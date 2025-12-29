class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currOnes = 0, maxOnes = 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                maxOnes = Math.max(currOnes, maxOnes);
                currOnes = 0;
            } else {
                currOnes++;
            }
        }
        
        return Math.max(currOnes, maxOnes);
    }
}
