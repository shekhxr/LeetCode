class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;

        int num = n;
        int bitMask = 0;
        while(num != 0) {
            bitMask = bitMask << 1 | 1;
            num = num >> 1;
        }

        return (~n) & bitMask;
    }
}
