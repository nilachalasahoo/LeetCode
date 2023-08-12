class Solution {
    private boolean safe(int[][] arr,int i,int j,int n){
        for(int k=0;k<n;k++){
            if(arr[i][k]==1)
                return false;
            if(arr[k][j]==1)
                return false;
        }
        int x=i-1,y=j-1;
        while(x>=0 && y>=0){
            if(arr[x][y]==1)
                return false;
            x--;
            y--;
        }
        x=i-1;y=j+1;
        while(x>=0 && y<n){
            if(arr[x][y]==1)
                return false;
            x--;
            y++;
        }
        return true;
    }
    private int helper(int[][] arr,int x){
        int n=arr.length;
        if(x==n)
            return 1;
        int ans=0;
        for(int i=0;i<n;i++){
            if(safe(arr,x,i,n)){
                arr[x][i]=1;
                ans+=helper(arr,x+1);
            }
            arr[x][i]=0;
        }
        return ans;
    }
    public int totalNQueens(int n) {
        int[][] arr=new int[n][n];
        return helper(arr,0);
    }
}
