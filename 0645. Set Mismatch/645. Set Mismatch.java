class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        int x[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            x[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(x[i]==2){
                arr[0]=i;
            }
            if(x[i]==0){
                arr[1]=i;
            }
        }
        return arr;
    }
}
