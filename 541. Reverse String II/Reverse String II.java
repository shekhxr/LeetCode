class Solution {
    public static void reverse(int a, int b, char chars[]) {
        while(a < b) {
            char temp = chars[a];
            chars[a] = chars[b];
            chars[b] = temp;
            a++;
            b--;
        }
    }

    public String reverseStr(String s, int k) {
        char chars[] = s.toCharArray();
        int i = 0;
        
        while(i < chars.length) {
            int j = Math.min(i + k - 1, chars.length - 1);
            reverse(i, j, chars);
            i += 2 * k;
        }

        return new String(chars);
    }
}
