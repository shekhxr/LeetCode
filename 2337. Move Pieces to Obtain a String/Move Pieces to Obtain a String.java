public class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0, j = 0;

        while (i < n || j < n) {
            // Skip '_' in start
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            // Skip '_' in target
            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            // If both pointers reach the end, transformation is valid
            if (i == n && j == n) {
                return true;
            }

            // If one pointer reaches the end earlier or characters differ, return false
            if (i == n || j == n || start.charAt(i) != target.charAt(j)) {
                return false;
            }

            char c = start.charAt(i);
            // Check movement restrictions
            if (c == 'L' && i < j) {
                // 'L' can only move left, so position in target can't be right of start
                return false;
            }
            if (c == 'R' && i > j) {
                // 'R' can only move right, so position in target can't be left of start
                return false;
            }

            i++;
            j++;
        }
        return true;
    }
}
