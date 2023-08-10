class Solution {
    private boolean safe(char[][] board,int r,int c,char x){
        //row and column
        for(int i=0;i<9;i++){
            if(board[r][i]==x)
                return false;
            if(board[i][c]==x)
                return false;
        }

        //grid
        r=(r/3)*3;
        c=(c/3)*3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==x)
                    return false;
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int r,int c){
        if(r==board.length)
            return true;;
        int nr,nc;
        if(c==board.length-1){
            nr=r+1;
            nc=0;
        }else{
            nr=r;
            nc=c+1;
        }
        
        if(board[r][c]!='.')
            return helper(board,nr,nc);
        else{
            for(int i=1;i<=9;i++){
                if(safe(board,r,c,(char)(i+'0'))){
                    board[r][c]=(char)(i+'0');
                    if(helper(board,nr,nc))
                        return true;
                    else
                        board[r][c]='.';
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
}
