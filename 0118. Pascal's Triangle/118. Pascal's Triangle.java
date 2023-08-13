class Solution {
    public List<List<Integer>> generate(int n){ 
        List<Integer> x=new ArrayList<>();
        x.add(1);
        List<List<Integer>> l=new ArrayList<>();
        l.add(x);
        for(int i=1;i<n;i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<=x.size();j++){
                if(j==0 || j==x.size())
                    arr.add(1);
                else
                    arr.add(x.get(j-1)+x.get(j));
            }
            x=arr;
            l.add(x);
        }
        return l;
    }
}
