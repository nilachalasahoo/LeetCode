class Solution {
    int dp[]=new int[1000];
    public int helper(int[] arr,int d,int i){
        if(dp[i]!=0)
            return dp[i];
        int ans=1,n=arr.length;
        for(int j=i+1;j<=(i+d) && j<n && arr[i]>arr[j];j++)
            ans=Math.max(ans,1+helper(arr,d,j));
        for(int j=i-1;j>=(i-d) && j>=0 && arr[i]>arr[j];j--)
            ans=Math.max(ans,1+helper(arr,d,j));
        dp[i]=ans;
        return ans;
    }
    public int maxJumps(int[] arr, int d) {
        int ans=1;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,helper(arr,d,i));
        }
        return ans;
    }
}
