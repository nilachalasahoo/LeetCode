class Solution {
    public boolean safe(char[][] board,int i,int j,char x){
        for(int k=0;k<9;k++){
            if(k!=j && board[i][k]==x)
                return false;
            if(k!=i && board[k][j]==x)
                return false;
        }
        int a=(i/3)*3;
        int b=(j/3)*3;
        for(int n1=a;n1<a+3;n1++){
            for(int n2=b;n2<b+3;n2++){
                if(n1!=i && n2!=j && board[n1][n2]==x)
                    return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !safe(board,i,j,board[i][j]))
                    return false;
            }
        }
        return true;
    }
}
