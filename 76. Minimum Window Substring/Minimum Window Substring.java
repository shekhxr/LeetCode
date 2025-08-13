class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Frequency of chars needed from t
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // Sliding window variables
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0; // window boundaries
        int formed = 0;           // number of chars with desired frequency
        int required = need.size();

        // Result variables (window length, start index)
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // Check if current char freq matches that in need
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // When all required chars are in the window, try to shrink it
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update minimum window if smaller
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                // Remove from window
                window.put(c, window.get(c) - 1);
                if (need.containsKey(c) && window.get(c).intValue() < need.get(c).intValue()) {
                    formed--;
                }
                left++; // shrink from left
            }

            right++; // expand window
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

}
