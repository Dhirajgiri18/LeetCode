class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); 
        int n = nums.length;      
        if(nums == null || n < 4) {
            return result;
        }

        Arrays.sort(nums);
        
        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i]==nums[i-1]) continue; //skip duplicates for i
            for(int j= i+1; j<n-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue; //skip duplicates for j
                int start = j+1, end = n-1;
                while(start<end){
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        
                        while(start<end && nums[start]==nums[start+1]) start++; //skip duplicate values
                        while(start<end && nums[end] == nums[end-1]) end--;
                        start++;
                        end--;
                    }else if(sum<target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return result;
    }
}