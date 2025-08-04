class Solution {
    public int compress(char[] chars) {
    int write = 0;
    int start = 0;

    for (int read = 0; read < chars.length; read++) {
        // Check if it's the end of the group
        if (read + 1 == chars.length || chars[read] != chars[read + 1]) {
            chars[write++] = chars[read]; // Write the character
            int count = read - start + 1;

            if (count > 1) { // Write the count digits
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }

            start = read + 1; // Move to the next group
        }
    }

    return write;
    }
}
