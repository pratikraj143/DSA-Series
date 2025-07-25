class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    private int binarySearch(int[] nums, int target, int left, int right){
        int mid = (left + right)/2;
        if( left > right){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }  else if (target < nums[mid]) {
            return binarySearch(nums, target, left, mid-1);
        }
        return binarySearch(nums, target, mid+1, right);
    }
}