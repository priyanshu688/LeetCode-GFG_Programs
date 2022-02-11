class Solution {
    public List<String> commonChars(String[] words) {
        int[] table = new int[26];
        Arrays.fill(table, Integer.MAX_VALUE);
        
        // For every word in words
        for(String word : words) {
            // Count the frequency of chars in word
            int[] freq = new int[26];
            for(char c : word.toCharArray()) freq[c - 'a']++;
            
            // Find the min frequency of char in all the words
            for(int i =  0; i < table.length; i++) {
                table[i] = Math.min(table[i], freq[i]);
            }
        }
        
        // Generate ans
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < table.length; i++) {
            while(table[i] > 0) {
                ans.add((char) ('a' + i) + "");
                table[i]--;
            }
        }
        
        return ans;
    }
}