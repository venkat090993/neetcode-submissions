class Solution {
    public int orangesRotting(int[][] grid) {

        int row = grid.length; 
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j]==1){
                    fresh+=1;
                }
                else if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int[][] dir = new int[][]{{-1,0}, {1,0}, {0,-1}, {0,1}};
        int count = 0;
        while(!queue.isEmpty() && fresh > 0){
            int size = queue.size();
            for(int i = 0; i<size;i++){
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];
            for(int[] d : dir){
                int nr = cell[0] + d[0];
                int nc = cell[1] + d[1];
                if(nr < 0 || nc < 0 || nr >=row || nc >= col){
                    continue;
                }
                if(grid[nr][nc] != 1){
                    continue;
                }
                grid[nr][nc] = grid[r][c] + 1;
                fresh--;
                queue.offer(new int[]{nr, nc});
            }
            }
            count++;
        }
        return fresh > 0 ? -1 : count;
    }
}
