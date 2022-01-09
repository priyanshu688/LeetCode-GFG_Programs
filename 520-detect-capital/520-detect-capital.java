class Solution {
    public boolean detectCapitalUse(String word) {
        boolean answer = false;
        if(word.toUpperCase().equals(word)) return true;
        if(word.toLowerCase().equals(word)) return true;
        
        for(int i = 1;i < word.length();i++){
            if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(i))){
                answer = true;
                continue;
            }else{
                answer = false;
                break;
            }
        }
        return answer;
        
    }
}