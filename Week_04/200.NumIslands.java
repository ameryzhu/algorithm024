class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i <grid.length; i ++){
            for(int j = 0; j < grid[i].length; j ++){
                if(grid[i][j]=='1'){
                    count++;
                    setZero(i,j,grid);
                }
            }
        }
        return count;
    }

    private void setZero(int row, int column,char [][] grid){
        if(row<0||row>=grid.length||column<0||column>=grid[row].length||grid[row][column]=='0'){
            return;
        }
        if(grid[row][column]=='1'){
            grid[row][column]='0';
        }
        //left
        setZero(row,column-1,grid);
        setZero(row,column+1,grid);
        setZero(row-1,column,grid);
        setZero(row+1,column,grid);
    }
}
