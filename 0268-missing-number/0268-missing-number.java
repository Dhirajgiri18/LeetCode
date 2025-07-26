class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        int expectedSum = n*(n+1)/2;

        for(int num : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}