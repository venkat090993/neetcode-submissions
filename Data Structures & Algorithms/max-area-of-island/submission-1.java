class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int maxArea = 0;

        for(int i = 0; i<row; i++){
            for ( int j = 0; j<col; j++){
                if(grid[i][j] == 1){
                  int  area = dfs(grid, i, j);
                    maxArea  = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
        
    }

    public int dfs(int[][] grid, int r, int c){

        int row = grid.length;
        int col = grid[0].length;

        if(r < 0 || c < 0 || r >=row || c >=col){
            return 0;
        }

        if(grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0;

        int area = 1;

       area += dfs(grid, r - 1, c);
       area += dfs(grid, r + 1, c);
       area += dfs(grid, r, c - 1);
       area += dfs(grid, r, c + 1);

       return area;
    
    }
}
