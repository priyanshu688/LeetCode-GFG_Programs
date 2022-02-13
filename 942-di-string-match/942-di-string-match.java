class Solution {
    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int start = 0, end = result.length - 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I') {
                result[i] = start;
                start++;
            } else {
                result[i] = end;
                end--;
            }     
        }
        result[result.length - 1] = start;
        return result;
    }
}