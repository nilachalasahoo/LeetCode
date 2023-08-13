class Solution {
    public int minPathSum(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        for(int i=1;i<m;i++){
            arr[i][0]+=arr[i-1][0];
        }
        for(int i=1;i<n;i++){
            arr[0][i]+=arr[0][i-1];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]+=Math.min(arr[i-1][j],arr[i][j-1]);
            }
        }
        if(m==1)
            return arr[0][n-1];
        else if(n==1)
            return arr[m-1][0];
        return arr[m-1][n-1];
    }
}
