class Solution {
    public boolean isPerfectSquare(int num) {
        long sum = 0;
        for (int i = 1; sum < num; i = i + 2) {
            sum = sum + i;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }
}