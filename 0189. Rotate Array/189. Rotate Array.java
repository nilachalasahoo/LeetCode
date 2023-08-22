class Solution {
    private void reverse(int[] arr,int i,int n){
        while(i<n){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}
