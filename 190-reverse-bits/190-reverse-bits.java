//program for java

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
  
      for (int i = 0; i < 32; i++) {
          int t = n & 1;
          n = n >> 1;
          res = res << 1;
          res = res | t;
  
     }
     return res;
    // return Integer.reverse(n);
    }
}
