class Solution {
    public int projectionArea(int[][] grid) {
        int max_row[]=new int[grid.length];
        int max_col[]=new int[grid[0].length];
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                max_row[i]=Math.max(max_row[i],grid[i][j]);
                max_col[j]=Math.max(max_col[j],grid[i][j]);
                if(grid[i][j]>0) ans++;
            }
        }
        for(int t:max_row) ans+=t;
        for(int t:max_col) ans+=t;
        return ans;
    }
}