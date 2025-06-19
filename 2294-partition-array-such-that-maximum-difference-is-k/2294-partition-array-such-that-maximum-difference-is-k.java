class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int partitions=1,track=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]- track > k){
                partitions++;
                track=nums[i];
            }
        }
        return partitions;
    }
}