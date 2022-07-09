class Solution {
    public String thousandSeparator(int n) {
        
         if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(n>0) {
            sb.append(n%10);
            if (++i == 3 && n/10 > 0) {
                i = 0;
                sb.append(".");
            }
            n = n/10;
        }
        return sb.reverse().toString();
       
      /*   if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(n>0) {
            sb.append(n%10);
            if (++i == 3 && n/10 > 0) {
                i = 0;
                sb.append(".");
            }
            n = n/10;
        }
        return sb.reverse().toString(); */
    }
}