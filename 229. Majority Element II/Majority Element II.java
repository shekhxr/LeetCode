class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int limit = nums.length / 3;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i],0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > limit) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
