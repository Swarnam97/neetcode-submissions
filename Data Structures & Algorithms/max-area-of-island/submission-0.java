class Solution {
    int[][] visited;
    private int dfs(int r, int c, int[][] grid){
        if(r < 0 || c < 0 || r >= grid.length || c>= grid[0].length || visited[r][c] == 1 || grid[r][c] == 0)
        return 0;

        visited[r][c] = 1;
        return 1+ dfs(r-1,c,grid) + dfs(r+1,c,grid) + dfs(r,c-1,grid) +
                    dfs(r,c+1,grid);

    }

    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        visited = new int[r][c];
        int area = 0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j] == 1)
                    area = Math.max(area,dfs(i,j,grid));
            }
        }

        return area;
    }
}
