class Solution {
    public boolean check(int[] piles,int h,int mid){
        int x=0;
        for(int i=0;i<piles.length;i++){
            x=x+piles[i]/mid;
            if(piles[i]%mid!=0)
                x=x+1;
        }
        if(x<=h)
            return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<high){
            int mid=(low+high)/2;
            if(check(piles,h,mid))
                high=mid;
            else
                low=mid+1;
        }
        return high;
    }
}
