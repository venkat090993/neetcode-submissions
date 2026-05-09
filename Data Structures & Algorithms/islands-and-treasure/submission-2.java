class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                // I want to add all sources to queue
                if(grid[i][j] == 0){
                    queue.offer(new int[]{i,j});
                }
            }
        }

        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};

        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];

            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr < 0 || nc < 0 || nr >= row || nc >= col){
                    continue;
                }
                if(grid[nr][nc] != 2147483647){
                    continue;
                }
                grid[nr][nc] = grid[r][c] + 1;
                queue.offer(new int[]{nr, nc});
            }
            
        }

    }
}
