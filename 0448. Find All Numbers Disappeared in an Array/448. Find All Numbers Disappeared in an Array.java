import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr=new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1 && nums[i] != nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
                i--;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1)
                arr.add(i+1);
        }
        return arr;
    }
}
