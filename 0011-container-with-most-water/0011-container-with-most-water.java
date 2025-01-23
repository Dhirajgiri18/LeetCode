class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea=0;
        // for(int i=0; i<height.length-1; i++){
        //     for(int j=i+1; j<height.length; j++){
        //         int area = Math.min(height[i],height[j]) * (j-i);
        //         maxArea= Math.max(maxArea,area);
        //     }
        // }
        // return maxArea;

        while(left<right){
            int area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(maxArea, area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}