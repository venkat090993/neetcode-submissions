class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int[][] directions = new int[][]{{-1,0}, {1,0}, {0, -1}, {0,1}};

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 0){
                    queue.offer(new int[]{i,j}); // I queued all the source
                }
            }
        }

        while(!queue.isEmpty()){
            int[] cell = queue.poll();

            for(int[] dir: directions){
                int r = cell[0] + dir[0];
                int c = cell[1] + dir[1];

                if(r < 0 || c < 0 || r >=row || c >=col){
                    continue;
                }

                if(grid[r][c] != 2147483647){
                    continue;
                }

                grid[r][c] = grid[cell[0]][cell[1]] + 1;

                queue.offer(new int[]{r,c});
            }
        }
    }
}
