class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']--;
            count[t.charAt(i) - 'a']++;
        }
        count[t.charAt(n) - 'a']++;
        int c = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                c = i + 'a';
                break;
            }
        }
        return (char) c;
    }
}