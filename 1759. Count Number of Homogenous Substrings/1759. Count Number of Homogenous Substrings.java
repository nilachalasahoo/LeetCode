class Solution {
    private long fun(long x){
        return (x*(x+1))/2;
    }
    public int countHomogenous(String s) {
        int n=s.length();
        int c=1;
        long x=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                x+=fun((long)c);
                c=1;
                continue;
            }
            c++;
        }
        x+=fun((long)c);

        return (int)(x%(1e9+7));
    }
}
