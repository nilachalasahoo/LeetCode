import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<(n-1)/3;i++){
            if(nums[i*3]!=nums[i*3+1])
                return nums[i*3];
        }
        return nums[n-1];
    }
}
