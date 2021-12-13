class Solution {
    public int[] countBits(int num) {
        if (num == 0) return new int[] {0};
        if (num == 1) return new int[] {0,1};
        int[] res = new int[num+1];
        res[0] = 0; res[1] = 1; int index = 2;
        
        int tmp = num; int k = 0; 
        while (tmp/2>0) { tmp/=2; k ++;}
        
        for (int i = 1; i <= k; i ++)
        {
            int limit = index;
            for (int j = 0; j < limit; j ++)
            {
                if (index == num+1) break;
                res[index] = 1 + res[j]; index++;
            }
        }
        return res;
    }
}