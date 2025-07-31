class Solution {
    private int next(int n) {
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = next(n);

        while(fast != 1 && slow != fast) {
            slow = next(slow); // Move slow pointer by one step
            fast = next(next(fast)); // Move fast pointer by two steps
        }

        return fast == 1; // If fast reached 1, number is happy
    }
}
