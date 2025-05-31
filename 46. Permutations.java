class Solution {
    private void permutations(int nums[], boolean used[], List<Integer> curr, List<List<Integer>> result) {
        if(curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(!used[i]) {
                curr.add(nums[i]);
                used[i] = true;
                permutations(nums, used, curr, result);
                used[i] = false;
                curr.remove(curr.size() - 1);
            }
        }  
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        permutations(nums, used, new ArrayList<>(), result);
        return result;
    }
}
