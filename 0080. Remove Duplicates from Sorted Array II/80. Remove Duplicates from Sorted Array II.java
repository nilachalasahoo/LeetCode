class Solution {
    public int removeDuplicates(int[] nums) {
        int x=nums[0],c=1,n=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==x){
                c++;
                if(c<=2){
                    nums[n]=nums[i];
                    n++;
                }
            }else{
                nums[n]=nums[i];
                n++;
                x=nums[i];
                c=1;
            }
        }
        return n;
    }
}
