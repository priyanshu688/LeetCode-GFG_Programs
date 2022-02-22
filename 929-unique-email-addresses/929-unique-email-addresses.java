class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>();
        for(String s:emails){
            StringBuffer temp=new StringBuffer();
            int i=0;
            while(s.charAt(i)!='+' && s.charAt(i)!='@'){
                if(s.charAt(i)=='.'){
                    i++;
                    continue;
                }
                temp.append(s.charAt(i));
                i++;
            }
            while(s.charAt(i)!='@')
                i++;
            temp.append(s.substring(i,s.length()-1));
            set.add(temp.toString());
        }
        return set.size();
    }
}