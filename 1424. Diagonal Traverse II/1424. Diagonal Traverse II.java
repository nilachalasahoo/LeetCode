class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> l=new ArrayList<>();
        int n=0;
        for(int i=0;i<nums.size();i++){
            List<Integer> r=nums.get(i);
            for(int j=0;j<r.size();j++){
                int x=i+j;
                if(l.size()<x+1){
                    l.add(new ArrayList<>());
                }
                l.get(x).add(r.get(j));
                n++;
            }
        }
        int arr[]=new int[n];
        int x=0;
        for(List<Integer> r:l){
            for(int i=r.size()-1;i>=0;i--){
                arr[x++]=r.get(i);
            }
        }
        return arr;
    }
}
