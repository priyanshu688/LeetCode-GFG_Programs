class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       if (r*c != mat[0].length*mat.length) return mat;

        int[][] res = new int[r][c];

        int rWrite = 0;
        int cWrite = 0;
        for (int y = 0; y < mat.length; y++) {
            for (int x = 0; x < mat[0].length; x++) {
                res[rWrite][cWrite] = mat[y][x];
                
                cWrite++;
                if (cWrite >= res[0].length) {
                    cWrite = 0;
                    rWrite++;
                }
            }
        }
        return res; 
    }
}