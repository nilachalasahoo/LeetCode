class Solution {
    public boolean isFascinating(int n) {
        if(n>=334)
            return false;
        int arr[]=new int[10];
        int n1=n*2;
        int n2=n*3;
        for(int i=0;i<3;i++){
            if(n%10==0 || arr[n%10]!=0)
                return false;
            else
                arr[n%10]=1;

            if(n1%10==0 || arr[n1%10]!=0)
                return false;
            else
                arr[n1%10]=1;

            if(n2%10==0 || arr[n2%10]!=0)
                return false;
            else
                arr[n2%10]=1;
                
            n=n/10;
            n1=n1/10;
            n2=n2/10;
        }
        return true;
    }
}
