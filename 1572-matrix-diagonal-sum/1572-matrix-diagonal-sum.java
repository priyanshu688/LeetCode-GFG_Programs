class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, length = mat.length;
        for (int count = 0; count < length; count++) {
            sum += mat[count][count];
            sum += mat[count][length-count-1];
        }
        if (length % 2 == 1) sum -= mat[length/2][length/2];
        return sum;
    
    }
}