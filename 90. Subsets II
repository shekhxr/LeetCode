class Solution {
    private void generateSubsets(int index, int nums[], List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++) {
            //Skip duplicates
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            current.add(nums[i]);
            generateSubsets(i+1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }
}
