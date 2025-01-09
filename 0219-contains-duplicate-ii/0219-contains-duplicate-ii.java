class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j] && j-i<=k){
        //             return true;
        //         }
        //     }
        // }

        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.contains(nums[i])) return true;
            h.add(nums[i]);
            if(h.size()>k)
                h.remove(nums[i-k]);
        }
        return false;
    }
}