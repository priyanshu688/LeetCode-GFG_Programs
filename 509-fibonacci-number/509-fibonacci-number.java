class Solution {
    public int fib(int n) {
        int i = 0;
    int j = 1;
    int number = 0;

    if(n<=1){
        return n;
    }

    for(int k = 0;k<n-1;k++){
        number = i+j;
        if(i<j){
            i = number;
        }else{
            j = number;
        }
    }

    return number;
    }
}