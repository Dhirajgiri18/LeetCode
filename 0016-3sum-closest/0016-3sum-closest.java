class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums==null || nums.length<3) {
            return 0;
        }
        int closest = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            int start = i+1, end = nums.length-1;
            while(start<end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == target){
                    return target;
                }
                if(sum < target){
                    start++;
                }else{
                    end--;  
                }
                int diffToTarget = Math.abs(sum-target);
                if(diffToTarget < minDiff){
                    closest = sum;
                    minDiff = diffToTarget;
                }
            }
        }
        return closest;
    }
}