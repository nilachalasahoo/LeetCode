import java.util.Arrays;
class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;
        if(n<5)
            return 0;
        Arrays.sort(nums);
        int min=Math.min(Math.min((nums[n-1]-nums[3]),(nums[n-2]-nums[2])),Math.min((nums[n-3]-nums[1]),(nums[n-4]-nums[0])));
        return min;
    }
}
