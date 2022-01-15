class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(count==k)
            {
                count=0;
                sb.append("-");
            }
            char c=s.charAt(i);
            if(c!='-')
            {
                c=Character.toUpperCase(c);
                sb.append(c);
                count++;
            }
        }
        if(sb.length()!=0 && sb.charAt(sb.length()-1)=='-')
            sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        return sb.toString();
    }
}