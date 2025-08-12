class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countHelp(nums,goal) - countHelp(nums,goal-1);
    }
    private int countHelp(int[] nums, int goal){
        if(goal<0){
                return 0;
            }
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l=l+1;
            }
            count+=(r-l)+1;
            r++;
        }
        return count;
    }
}