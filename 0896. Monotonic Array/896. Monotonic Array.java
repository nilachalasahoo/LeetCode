class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean x=true;
        int i=1,n=nums.length;
        while(i<n){
            if(nums[i]==nums[i-1]){
                i++;
            }else{
                x=(nums[i]-nums[i-1])>0;
                break;
            }
        }
        while(i<n){
            if(nums[i]==nums[i-1]){
                i++;
            }else if(!((nums[i]-nums[i-1])>0 ^ x)){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}
