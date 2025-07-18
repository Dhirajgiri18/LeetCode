class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int farthest = 0, end = 0, ans = 0;
        for(int i=0; i<n-1; i++){
            farthest = Math.max(farthest, i+nums[i]);
            if(farthest >= n-1){
                ans++;
                return ans;
            }

            if(i==end){
                ans++;
                end = farthest;
            }
        }
        return ans;
    }
}