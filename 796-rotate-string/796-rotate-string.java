class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
    
    String a=s+s;
    
    for(int i=0;i<a.length()-s.length();i++){
        if(a.substring(i,i+goal.length()).equals(goal)) return true;
    }
    return false;
    }
}