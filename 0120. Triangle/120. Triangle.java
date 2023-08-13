class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int arr[][]=new int[n][n];
        arr[0][0]=triangle.get(0).get(0);
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j!=0 && j!=i)
                    arr[i][j]=triangle.get(i).get(j)+Math.min(arr[i-1][j-1],arr[i-1][j]);
                else if(j==0)
                    arr[i][j]=triangle.get(i).get(j)+arr[i-1][j];
                else
                    arr[i][j]=triangle.get(i).get(j)+arr[i-1][j-1];
            }
        }
        int min=arr[n-1][0];
        for(int i=1;i<n;i++){
            if(min>arr[n-1][i])
                min=arr[n-1][i];
        }
        return min;
    }
}
