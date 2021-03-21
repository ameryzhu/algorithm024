class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9 ; i ++){
            if(hasSameInRow(board,i)){
                return false;
            }
        }
        for(int i = 0 ; i <9 ; i ++){
            if(hasSameInColumn(board,i)){
                return false;
            }
        }
        for(int i = 0 ; i < 3; i ++){
            for(int j = 0 ; j <3; j ++){
                if(hasInCircle(board,i*3,j*3)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasSameInRow(char[][] board,int row){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0 ; i < 9; i ++){
            if(map.get(board[row][i])!=null){
                return true;
            }else{
                if(board[row][i]!='.')
                    map.put(board[row][i],1);
            }
        }
        return false;
    }

    private boolean hasSameInColumn(char [][] board, int column){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < 9; i ++){
            if(map.get(board[i][column])!=null){
                return true;
            }else{
                if(board[i][column]!='.')
                    map.put(board[i][column],1);
            }
        }
        return false;
    }

    private boolean hasInCircle(char [][] board, int startRow, int startColumn){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0 ; i < 3 ; i ++){
            for(int j = 0 ; j < 3; j ++){
                if(map.get(board[startRow+i][startColumn+j])!=null){
                    return true;
                }else{
                    if(board[startRow+i][startColumn+j]!='.')
                        map.put(board[startRow+i][startColumn+j],1);
                }
            }
        }
        return false;
    }
}
