public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int x) {
        int count = 0;
    for(int i=1; i<33; i++){
        if(getBit(x, i) == true){
            count++;
        }
    }
    return count;
}
 
public boolean getBit(int x, int i){
    return (x & (1 << i)) != 0;
 }
}