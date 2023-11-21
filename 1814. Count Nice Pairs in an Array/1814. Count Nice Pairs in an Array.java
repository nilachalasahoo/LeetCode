class Solution {
    private int rev(int x){
        int r=0;
        while(x!=0){
            r=r*10+x%10;
            x=x/10;
        }
        return r;
    }
    public int countNicePairs(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]-rev(nums[i]);
        }
        Arrays.sort(nums);
        int m=1000000007;
        long res=0;
        long c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                c++;
            }else{
                res=res%m+(c*(c-1)/2)%m;
                c=1;
            }
        }
        res=res%m+(c*(c-1)/2)%m;
        return (int)(res%m);
    }
}
