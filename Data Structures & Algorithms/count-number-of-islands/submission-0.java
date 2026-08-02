class Solution {
    private void dfs(int r, int c, char[][] grid){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] =='0')
        return;

        grid[r][c] = '0';
        dfs(r-1,c, grid);
        dfs(r+1,c,grid);
        dfs(r,c-1,grid);
        dfs(r,c+1,grid);
    }

    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid.length;
        int islands = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    dfs(i,j, grid);
                    islands ++;
                }
            }
        }  

        return islands;                                  
    }
}
