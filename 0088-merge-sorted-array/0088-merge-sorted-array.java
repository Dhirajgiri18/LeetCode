class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;  //2 1
        int j=n-1;  //2 1 0
        int k=m+n-1;//5 4 3 2

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){  // 3 > 2 
                nums1[k] = nums1[i]; 
                i--;
                k--;
            }else{
                nums1[k] = nums2[j]; //nums1[4] = nums2[2]  5
                j--;
                k--;
            }
        }

    }
}