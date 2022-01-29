class Solution {
    public boolean judgeCircle(String moves) {
        int countUD=0;
        int countRL=0;
        for(int i=0;i < moves.length();i++){
            if(moves.charAt(i)=='U')
               countUD++;
            else if(moves.charAt(i)=='D')   
                countUD--;
            else if(moves.charAt(i)=='R')
                countRL++;
            else
                countRL--;
        }
        if(countUD==0 && countRL==0)
            return true;
        return false;
    }
}