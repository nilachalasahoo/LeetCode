class Solution {
    public int reverse(int x) {
        long s=0;
        while(x!=0){
            s=s*10+x%10;
            x=x/10;
        }
        if(s<Math.pow(-2,31) || s>=Math.pow(2,31))
            return 0;
        return (int)s;
    }
}
