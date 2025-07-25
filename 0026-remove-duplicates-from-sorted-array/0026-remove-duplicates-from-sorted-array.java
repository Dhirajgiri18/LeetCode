class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 1; // Start from 1 as nums[0] is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
