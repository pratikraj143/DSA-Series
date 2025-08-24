class Solution {
    public int lowerBound(int[] nums,int target){
        int low=0,high=nums.length-1;
        int ans =nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int upperBound(int[] nums,int target){
        int low=0,high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        int lb=lowerBound(nums,target);
        if(lb==nums.length||nums[lb]!=target){
            return res;
        }
        int ub=upperBound(nums, target);
        res[0]=lb;
        res[1]=ub-1;
        return res;
    }
}