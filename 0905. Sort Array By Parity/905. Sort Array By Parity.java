class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int j=0;j<n;j++){
          if(nums[j]%2==0){
            int x=nums[i];
            nums[i]=nums[j];
            nums[j]=x;
            i++;
          }
        }
        return nums;
    }
}
