class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int L = arr.length;
        if(L<=2) return false;
        for(int i=2;i<L;i++){
            if(arr[i-2]%2!=0 && arr[i-1]%2!=0 && arr[i]%2!=0 )
                return true;
        }
        return false;
    }
}