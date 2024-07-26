class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count =0;

        for(int i=0; i<nums.length; i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }else{
                nums[count] = nums[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return count;     
    }
}