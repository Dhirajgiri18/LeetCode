class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            for(int j=1; j<n; j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}