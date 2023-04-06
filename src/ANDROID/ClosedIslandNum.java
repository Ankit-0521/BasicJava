package ANDROID;
//Given a 2D grid consists of 0s (land) and 1s (water).  An island is a maximal 4-directionally connected group of 0s
// and a closed island is an island totally (all left, top, right, bottom) surrounded by 1s.
//
//Return the number of closed islands.
//
//
//
//Example 1:

//Input: grid = [[1,1,1,1,1,1,1,0],[1,0,0,0,0,1,1,0],[1,0,1,0,1,1,1,0],[1,0,0,0,0,1,0,1],[1,1,1,1,1,1,1,0]]
//Output: 2
//Explanation:
//Islands in gray are closed because they are completely surrounded by water (group of 1s).
public class ClosedIslandNum {
    public int closedIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i =0; i<m;i++){
            for(int j=0;j<n;j++){
                if((i*j==0 || i==m-1 || j==n-1) && (grid[i][j]==0)){
                    dfs(i,j,grid);
                }
            }
        }
        int count=0;
        for(int i =0; i<m-1; i++){
            for(int j = 0; j<n-1; j++){
                if(grid[i][j]==0){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    void dfs(int i , int j, int[][] grid){
        int m = grid.length, n = grid[0].length;
        if(i<0 || i>=m || j<0 ||j>=n || grid[i][j]!=0){
            return;
        }
        grid[i][j]=-1;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        for(int k = 0; k<4; k++){
            int nx = i+dx[k];
            int ny = j + dy[k];
            dfs(nx,ny,grid);
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
        ClosedIslandNum cn = new ClosedIslandNum();
        System.out.println(cn.closedIsland(grid));
    }
}
