class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        if(s.length() == 1) {
            return 1;
        }
        
        int left = 0;
        int right = 0;
        Set <Character> map = new HashSet<>();
        int ans = 0;

        while(right < s.length()) {
            if(!map.contains(s.charAt(right))) {
                map.add(s.charAt(right));
                ans = Math.max(ans, right-left+1);
                right++;
            } else {
                map.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}
