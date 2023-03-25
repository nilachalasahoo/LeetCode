class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int s=0,n=cardPoints.length;
        for(int i=n-k;i<n;i++){
            s=s+cardPoints[i];
        }
        int ans=s,sum=0;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[i];
            s=s-cardPoints[n-k+i];
            ans=Math.max(ans,sum+s);
        }
        return ans;
    }
}
