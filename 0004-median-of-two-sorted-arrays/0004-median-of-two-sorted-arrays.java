class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                nums3[k++] = nums1[i++];
            }else{
                nums3[k++] = nums2[j++];
            }
        }
        while(i<m){
            nums3[k++] = nums1[i++];
        }
        while(j<n){
            nums3[k++] = nums2[j++];
        }
        int total = nums3.length;
        if(total%2==1){
            return nums3[total/2];
        }else{
            return (nums3[total/2-1]+nums3[total/2]) / 2.0;
        }
    }
}