class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1"; //Base Case

        String s = countAndSay(n - 1);

        //Now modify s
        String ans = "";
        int i = 0, j = 0;

        while(j < s.length()) {
            if(s.charAt(i) == s.charAt(j)) j++;
            else {
                int l = j - i; //length
                ans += l;
                ans += s.charAt(i);
                i = j;
            }
        }

        int l = j - i;
        ans += l;
        ans += s.charAt(i);
        return ans;
    }
}
