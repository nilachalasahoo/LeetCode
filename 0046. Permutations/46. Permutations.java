class Solution {
    public List<List<Integer>> helper(int[] nums,int n){
        if(n==0){
            List<List<Integer>> l=new ArrayList<>();
            l.add(new ArrayList<>());
            l.get(0).add(nums[0]);
            return l;
        }
        int x=nums[n];
        List<List<Integer>> l=helper(nums,n-1);
        List<List<Integer>> ans=new ArrayList<>();
        int k=0;
        for(int i=0;i<l.size();i++){
            List<Integer> a=l.get(i);
            for(int j=0;j<=n;j++){
                List<Integer> b=new ArrayList<>(a);
                ans.add(b);
                ans.get(k).add(j,x);
                k++;
            }
        }
        return ans;
    }
    public List<List<Integer>> permute(int[] nums) {
        return helper(nums,nums.length-1);
    }
}
