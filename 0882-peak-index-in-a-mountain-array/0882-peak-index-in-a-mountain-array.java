class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1, right = arr.length-2;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]){
                return mid;
            }else if(arr[mid - 1] < arr[mid]){ // right half
                left = mid + 1;
            }else { // left half
                right = mid - 1;
            }
        }
        return -1;
    }
}