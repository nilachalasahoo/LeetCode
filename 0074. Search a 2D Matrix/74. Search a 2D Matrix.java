class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][n-1]<target)
                    break;
                if(matrix[i][j]==target)
                    return true;
                if(matrix[i][j]>target)
                    return false;
                
            }
        }
        return false;
    }
}
