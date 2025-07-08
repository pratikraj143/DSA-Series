class Solution {
    public int maxProduct(int[] nums) {
        int pre =1,suf=1,ans=nums[0],n=nums.length;

        for(int i=0;i<n;i++){
            if(pre == 0) pre =1;
            if(suf == 0) suf =1;

            pre *=nums[i];
            suf *=nums[n-i-1];
            ans = Math.max(ans ,Math.max(pre,suf));
        }
        return ans;
    }
}