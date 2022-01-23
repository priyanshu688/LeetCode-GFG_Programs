class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int k=0;
        while(k<n){
            for(int i=0,j=k ; i+1<m && j+1<n; i++,j++){
                if(matrix[i][j]!=matrix[i+1][j+1])
                    return false;
            }
            k++;
        }
        k=0;
        while(k<m){
            for(int i=k,j=0 ; i+1<m && j+1<n; i++,j++){
                if(matrix[i][j]!=matrix[i+1][j+1])
                    return false;
            }
            k++;
        }
        return true;
    }
}