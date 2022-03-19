class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[]=new int[26];
        int totalLength=0;
        for(char ch:chars.toCharArray())
        {
            freq[ch-'a']++;
        }
        for(String word:words)
        {
            int freq1[]=new int[26];
            int flag=1;
            for(char ch: word.toCharArray())
            {
                freq1[ch-'a']++;
                if(freq1[ch-'a']>freq[ch-'a'])
                {
                    flag=0;
                }
            }
            if(flag==1)
                totalLength+=word.length();
        }
        return totalLength;
    }
}