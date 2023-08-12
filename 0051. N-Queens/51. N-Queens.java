class Solution {
    private boolean safe(char[][] arr,int i,int j){
        int n=arr.length;
        for(int k=0;k<n;k++){
            if(arr[i][k]=='Q')
                return false;
            if(arr[k][j]=='Q')
                return false;
        }
        int x=i-1,y=j-1;
        while(x>=0 && y>=0){
            if(arr[x][y]=='Q')
                return false;
            x--;
            y--;
        }
        x=i-1;y=j+1;
        while(x>=0 && y<n){
            if(arr[x][y]=='Q')
                return false;
            x--;
            y++;
        }
        return true;
    }
    private List<String> change(char[][] arr){
        List<String> x=new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            x.add(new String(arr[i]));
        }
        return x;
    }
    private void helper(char[][] arr,int x,List<List<String>> l){
        if(x==arr.length){
            l.add(change(arr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(safe(arr,x,i)){
                arr[x][i]='Q';
                helper(arr,x+1,l);
            }
            arr[x][i]='.';
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        List<List<String>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        helper(arr,0,l);
        return l;
    }
}
