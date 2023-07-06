class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length,sum=0,min=1000000;
        for(int i=0,j=0;i<n;i++){
            sum=sum+nums[i];
            while(sum>=target){
                min=Math.min(min,i-j+1);
                sum=sum-nums[j];
                j++;
            }
        }
        if(min==1000000)
            return 0;
        return min;
    }
}
