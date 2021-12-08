class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        while (set.add(n)) {
            if (n == 1) return true;
            while (n > 0) {
                int d = n % 10;
                res += d * d;
                n /= 10;
            }
            n = res;
            res = 0;
        }
        return false;
    }
}