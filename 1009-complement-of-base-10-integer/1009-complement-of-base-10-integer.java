class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1; // Checking for base case
        int res = 0;
        int fac = 1; // keep for 2 basically
        
        while(n != 0){
            res += fac * (n % 2 == 0 ? 1 : 0);
            fac *= 2;
            n /= 2;
        }
        return res;
    }
}