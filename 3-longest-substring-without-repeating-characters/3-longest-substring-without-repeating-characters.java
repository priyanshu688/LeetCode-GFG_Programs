class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        int max=0;
        ArrayList<Character> list=new ArrayList();
        
        for(int i=0;i<length;i++)
        {
            int j=0;
            while((i+j)<length && !list.contains(s.charAt(i+j)))
            {
                list.add(s.charAt(i+j));
                j++;
            }
            if(j>max)
                max=j;
            list.clear();
        }
        
        return max;
    }
}