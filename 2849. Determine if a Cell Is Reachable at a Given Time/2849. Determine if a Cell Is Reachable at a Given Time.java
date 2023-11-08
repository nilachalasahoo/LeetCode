class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx==fx&&sy==fy&&t==1)
            return false;
        int x=Math.max(Math.abs(fx-sx),Math.abs(fy-sy));
        return x<=t;
    }
}
