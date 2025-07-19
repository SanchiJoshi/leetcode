class Solution {
    public void solveSudoku(char[][] board) {
        
        helper(board);
        
    }

    public static boolean helper(char[][] board){


        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == '.'){     // if cells are vacant
                    for(int k=1;k<=9;k++){
                        if(isValid(board,i,j,(char)(k+'0') )){
                            board[i][j] = (char)(k+'0');
                            if(helper(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;

    }
    public static boolean isValid(char[][] board,int row,int col,char store){
        // row check 
        for(int i=0;i<board[0].length;i++){
            if(board[row][i] == store)
                return false;
        }        
        // col check
        for(int i=0;i<board.length;i++){
            if(board[i][col] == store)
                return false;
        }
        // grid check
        int r = row/3; 
        int c = col/3;
        for(int i=r*3;i<r*3+3;i++){
            for(int j=c*3;j<c*3+3;j++){
                if(board[i][j] == store)
                    return false;
            }
        }
        return true;
    }

}