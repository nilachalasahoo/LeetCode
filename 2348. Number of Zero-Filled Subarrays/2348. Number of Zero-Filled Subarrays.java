class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long s=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }else{
                if(c!=0)
                    s=s+c*(c+1)/2;
                c=0;
            }
        }
        if(c!=0){
            s=s+c*(c+1)/2;
        }
        return s;
    }
}
