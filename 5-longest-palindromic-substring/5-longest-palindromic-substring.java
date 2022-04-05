class Solution {
    public String longestPalindrome(String s) {
        // Corner cases.
  if (s.length() <= 1) return s;

  int len = s.length(), longestPalindromeStart = 0, longestPalindromeLength = 1;
  // state[i][j] true if s[i, j] is palindrome.
  boolean[][] state = new boolean[len][len];

  // Base cases.
  for (int i = 0; i < len; i++) {
    state[i][i] = true; // dist = 0.
  }

  for (int i = len - 1; i >= 0; i--) {
    for (int dist = 1; dist < len - i; dist++) {
      int j = dist + i;
      state[i][j] = (dist == 1) ? s.charAt(i) == s.charAt(j) : (s.charAt(i) == s.charAt(j)) && state[i + 1][j - 1];
      if (state[i][j] && j - i + 1 > longestPalindromeLength) {
        longestPalindromeLength = j - i + 1;
        longestPalindromeStart = i;
      }
    }
  }

  return s.substring(longestPalindromeStart, longestPalindromeStart + longestPalindromeLength);
    }
}