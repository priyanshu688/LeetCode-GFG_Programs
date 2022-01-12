class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0, j = 0, result = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                result++;
                i++;
            }
            j++;
        }
        return result;
    }
}