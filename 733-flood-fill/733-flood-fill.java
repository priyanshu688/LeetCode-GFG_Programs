class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        fill(image, sr, sc, image[sr][sc], image.length, image[0].length, newColor);
        return image;
    }
    
    public void fill(int[][] image, int sr, int sc, int oldColor,  int m, int n, int newColor) {
        if(sr < 0 || sc < 0 || sr >= m || sc >= n){
            return;
        }
        
        if(image[sr][sc] == newColor || image[sr][sc] != oldColor){
            return;
        }
        else{
            image[sr][sc] = newColor;
        }
                
        fill(image, sr - 1, sc, oldColor, m, n, newColor);
        fill(image, sr, sc - 1, oldColor, m, n, newColor);
        fill(image, sr + 1, sc, oldColor, m, n, newColor);
        fill(image, sr, sc + 1, oldColor, m, n, newColor);
    }
}