class Solution {
    public List<Integer> getRow(int n){ 
        List<Integer> x=new ArrayList<>();
        x.add(1);
        for(int i=1;i<=n;i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<=x.size();j++){
                if(j==0 || j==x.size())
                    arr.add(1);
                else
                    arr.add(x.get(j-1)+x.get(j));
            }
            x=arr;
        }
        return x;
    }
}
