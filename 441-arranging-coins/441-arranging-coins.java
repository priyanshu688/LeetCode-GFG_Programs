class Solution {
    public int arrangeCoins(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input Number is invalid. Only positive numbers are allowed");
        }

        int mask = 1 << 15;
        long result = 0;

        while (mask > 0) {
            long temp = result | mask;
            long coinsFilled = temp * (temp + 1) / 2;
            if (coinsFilled == n) {
                return (int) temp;
            }
            if (coinsFilled < n) {
                result = temp;
            }
            mask >>= 1;
        }

        return (int) result;
    }
}