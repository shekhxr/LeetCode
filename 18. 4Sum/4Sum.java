class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++) {
            // Skip duplicates for i
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++) {
                // Skip duplicates for j
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int l = j + 1;
                int r = nums.length - 1; 

                while(l < r) {
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];

                    if(sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        // Skip duplicates for l and r
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        l++; 
                        r--;
                    } else if(sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }

        return result;
    }
}
