class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean exists[] = new boolean[nums.length + 1];
        for(int num : nums) {
            exists[num] = true;
        }

        List<Integer> result = new ArrayList<>();
        for(int i=1;i<exists.length;i++) {
            if(exists[i] == false) {
                result.add(i);
            }
        }

        return result;
    }
}
