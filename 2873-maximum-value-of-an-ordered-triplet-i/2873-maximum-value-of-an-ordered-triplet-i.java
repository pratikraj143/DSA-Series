class Solution {
    public long maximumTripletValue(int[] nums) {
         int n = nums.length,Left_max = 0, diff_max = 0;
        long res = 0;
        for(int i=0;i<n;i++) {
            res = Math.max(res, (long) diff_max * nums[i]);
            diff_max = Math.max(diff_max, Left_max - nums[i]);
            Left_max = Math.max(Left_max, nums[i]);
        }
        return res;
    }
}