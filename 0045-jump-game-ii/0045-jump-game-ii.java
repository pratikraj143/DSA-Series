class Solution {
    public int jump(int[] nums) {
        int jump=0,l=0,r=0,far=0;
        while(r<nums.length-1){
            for(int i=l;i<=r;i++){
                far=Math.max(far,i+nums[i]);
            }
            l=r+1;
            r=far;
            jump++;
        }
        return jump;
    }
}