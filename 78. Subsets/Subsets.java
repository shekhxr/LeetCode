class Solution {
    public static void genSubsets(int nums[], int i, List<Integer> ans, List<List<Integer>> result) {
        if(i == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        //Include
        ans.add(nums[i]);
        genSubsets(nums, i + 1, ans, result);

        //Exclude
        ans.remove(ans.size() - 1);
        genSubsets(nums, i + 1, ans, result);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        genSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }
}
