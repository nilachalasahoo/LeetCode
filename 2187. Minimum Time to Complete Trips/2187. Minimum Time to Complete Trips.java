class Solution {
    public boolean check(int[] time,int totalTrips,long mid){
        long x=0;
        for(int i=0;i<time.length;i++){
            x=x+mid/time[i];
        }
        if(x>=totalTrips){
            return true;
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long low=Long.MAX_VALUE;
        long high=0;
        for(int i=0;i<time.length;i++){
            low=Math.min(low,time[i]);
        }
        high=low*totalTrips;
        while(low<high){
            long mid=(high+low)/2;
            if(check(time,totalTrips,mid))
                high=mid;
            else
                low=mid+1;
        }
        return low;
        
    }
}
