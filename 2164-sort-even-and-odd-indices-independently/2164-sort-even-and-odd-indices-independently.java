class Solution {
    public int[] sortEvenOdd(int[] a) {
        for(int i=0;i<a.length;i++) {
            int pos=i;
            for(int j=i+2;j<a.length;j+=2) {
                if(i%2==0 && a[pos]> a[j]) {
                    pos = j;
                } else if(i%2==1 &&a[pos] < a[j]) {
                    pos = j;
                }
            }
            if(i!=pos) {
                int t = a[i];
                a[i] = a[pos];
                a[pos] = t;
            }
            
        }
        return a;
    }
}