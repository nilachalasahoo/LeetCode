class Solution {
    public double myPow(double x, int n) {
        if(x==1)
            return 1;
        if(n==0)
            return 1;
        int r=n%2;
        double a;
        if(r==0)
            a=1;
        else if(r==1)
            a=x;
        else{
            a=1.0/x;
        }
        return a*myPow(x*x,n/2);
    }
}
