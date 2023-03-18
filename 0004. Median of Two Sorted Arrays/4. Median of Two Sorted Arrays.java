class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[] arr=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(j<n){
            arr[k]=nums2[j];
            j++;k++;
        }
        while(i<m){
            arr[k]=nums1[i];
            i++;k++;
        }
        if((m+n)%2!=0)
            return arr[(m+n)/2];
        else
            return (arr[(m+n)/2-1]+arr[(m+n)/2])/2.0;
    }
}
