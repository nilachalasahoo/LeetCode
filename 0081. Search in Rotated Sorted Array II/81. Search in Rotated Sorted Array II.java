class Solution {
    public boolean search(int[] nums, int target) {
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target)
                return true;
            
            if(nums[st]==nums[mid] && nums[mid]==nums[end]){
                st++;
                end--;
            }else if(nums[st]<=nums[mid]){
                if(target>=nums[st] && target<=nums[mid])
                    end=mid-1;
                else
                    st=mid+1;
            }else{
                 if(target>=nums[mid] && target<=nums[end])
                    st=mid+1;
                else
                    end=mid-1;
            }
        }
        return false;
    }
}
