class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int Max=0;
        for(int i=0;i<nums.length-1;i++){
           Max = Math.max(Max,Math.abs(nums[i]-nums[i+1]));
        }
         Max = Math.max(Max,Math.abs(nums[0]-nums[nums.length-1]));
        return Max;
    }
}