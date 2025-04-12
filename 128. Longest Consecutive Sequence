class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        Set <Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }

        int lcs = 1; //longest consecutive sequence
        for(int s : set) {
            if(set.contains(s-1)) { //not the starting of a consecutive sequence
                continue;
            } else { //starting of a consecutive sequence
                int curr = s;
                int ccs = 1; //current consecutive sequence
                while(set.contains(curr+1)) {
                    curr++;
                    ccs++;
                }
                lcs = Math.max(ccs,lcs);
            }
        }
        return lcs;
    }
}
