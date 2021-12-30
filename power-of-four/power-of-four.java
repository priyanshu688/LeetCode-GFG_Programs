class Solution {
    public boolean isPowerOfFour(int num) {
       if (num <= 0) {
            return false;
        }
        while (num > 3) {
            if (num % 4 != 0) {
                return false;
            }
            num = num / 4;
        }
        return num == 1;
    }
}