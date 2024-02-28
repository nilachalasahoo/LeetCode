class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j,k;
        for(i=m+n-1,j=m-1,k=n-1;i>=0&&j>=0&&k>=0;i--){
            if(nums1[j]>nums2[k]){
                nums1[i]=nums1[j];
                j--;
            }else{
                nums1[i]=nums2[k];
                k--;
            }
        }
        while(j>=0){
            nums1[i]=nums1[j];
            i--;
            j--;
        }
        while(k>=0){
            nums1[i]=nums2[k];
            i--;
            k--;
        }
    }
}
