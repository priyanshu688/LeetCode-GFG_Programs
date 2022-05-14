public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;

   while(n !=0 ){
     count++;
     n = n &(n-1);    //remember this logic it helps in many problems
     System.out.println(n);
     
   } 
  
  return count;

    }
}