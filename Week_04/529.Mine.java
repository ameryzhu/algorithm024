class Solution {
    int[] deltaY = {-1,0,1,-1,1,-1,0,1};
    int[] deltaX = {-1,-1,-1,0,0,1,1,1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];
        if(board[x][y]=='M'){
            board[x][y]='X';
            return board;
        }else if(board[x][y]=='E'){
            dfs(board,x,y);
        }
        return board;
    }

    private void dfs(char[][] board, int x,int y){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y]!='E'){
            return;
        }
        int numOfMines = calculateMines(board,x,y);
        if(numOfMines == 0){
            board[x][y] = 'B';
            for(int i = 0; i < deltaX.length ; i ++){
                dfs(board,x+deltaX[i],y+deltaY[i]);
            }
        }else{
            board[x][y] = (char)('0'+numOfMines);
        }
class Solution {
    int[] deltaY = {-1,0,1,-1,1,-1,0,1};
    int[] deltaX = {-1,-1,-1,0,0,1,1,1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];
        if(board[x][y]=='M'){
            board[x][y]='X';
            return board;
        }else if(board[x][y]=='E'){
            dfs(board,x,y);
        }
        return board;
    }

    private void dfs(char[][] board, int x,int y){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y]!='E'){
            return;
        }
        int numOfMines = calculateMines(board,x,y);
        if(numOfMines == 0){
            board[x][y] = 'B';
            for(int i = 0; i < deltaX.length ; i ++){
                dfs(board,x+deltaX[i],y+deltaY[i]);
            }
        }else{
            board[x][y] = (char)('0'+numOfMines);
        }
    }

    private int calculateMines(char[][] board,int x, int y){
        int mines = 0;
        int rowLength = board.length;
        int columnLength = board[0].length;
        for(int i = 0 ; i < deltaX.length ; i ++){
             int column= y+deltaY[i];
             int row = x+deltaX[i];
            if(column < 0 || column >= columnLength || row < 0 || row >= rowLength){
                continue;
            }
            if(board[row][column]=='M')  {
                mines++;
            };
        }
        return mines;
    }
}
