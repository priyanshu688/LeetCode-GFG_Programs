 class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];
        int index = 0;
        int add = 1;
        
        if (numRows == 1)
            return s;
        
        for (int i = 0; i < sbs.length; i++)
            sbs[i] = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            // Need to reverse directions and go back down.
            if (index == -1) {
                add *= -1;
                index += 2*add;
            } else if (index == numRows) {
                add *= -1;
                index += 2*add;
            }
            
            // We're adding new values from the top down.
            if (index >= 0 && index < numRows) {
                sbs[index].append(s.charAt(i));
                index += add;
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < sbs.length; i++) {
            result.append(sbs[i].toString());
        }
        return result.toString();
    }
}