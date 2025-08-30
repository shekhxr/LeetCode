class Solution {
    public int reverse(int x) {
        int number = x;
        int rev = 0;

        while (number != 0){
            int lastDigit = number % 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                return rev = 0;
            }

            rev = rev * 10 + lastDigit;
            number /= 10;
        }
        
        return rev;
    }
}
