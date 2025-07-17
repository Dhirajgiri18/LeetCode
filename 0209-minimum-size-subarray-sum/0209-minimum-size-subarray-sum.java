class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minSize = Integer.MAX_VALUE;
        int curSum=0;
        int low=0,high=0;
        while(high<n){
            curSum+=nums[high];
            high++;
            while(curSum>=target){
                int currentSize = high-low;
                minSize = Math.min(minSize, currentSize);
                curSum -= nums[low];
                low++;
            }
        }
        return minSize == Integer.MAX_VALUE?0:minSize;
    }
}