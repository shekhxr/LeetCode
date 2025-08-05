class Solution {
    public long minimumSteps(String s) {
        int write = 0;
        long count = 0;

        for(int read=0;read<s.length();read++) {
            if(s.charAt(read) == '0') {
                count += read - write;
                write++;
            } 
        }

        return count;
    }
}
