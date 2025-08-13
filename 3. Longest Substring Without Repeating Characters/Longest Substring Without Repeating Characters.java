class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        int lastSeen[] = new int[128]; // for all ASCII chars
        Arrays.fill(lastSeen, -1);

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // If character was seen inside the current window
            if(lastSeen[c] >= start) {
                start = lastSeen[c] + 1;
            }

            lastSeen[c] = end;
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
