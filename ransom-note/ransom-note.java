class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] array = magazine.toCharArray();
         
        int[] countArray = new int[26];        
        for(char c : array){            
            countArray[c-'a']++;
        }
         
        array = ransomNote.toCharArray();
        for(char c : array){   
            if(countArray[c-'a'] > 0){
                countArray[c-'a']--;
            }else {
                return false;
            }            
        }
        return true;
    }
}