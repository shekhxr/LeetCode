class Solution {
    public int hammingWeight(int n) {
        int countOfOne = 0;
        while(n != 0) {
            int lastDigit = n & 1;
            if(lastDigit == 1) countOfOne++;
            n = n >> 1;
        }

        return countOfOne;
    }
}
