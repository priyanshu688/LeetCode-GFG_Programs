class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int result  = 0;
        for (char c: s.toCharArray())
            if(++count[c] == 2){
                result +=2;
                count[c] = 0;
            }
        return result == s.length() ? result : result + 1;
    }
}