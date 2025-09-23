class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int maxFreq = 0;
        for (int val : hm.values()) {
            maxFreq = Math.max(maxFreq, val);
        }
        int sum=0;
        for (int val : hm.values()) {
            if(val == maxFreq){
                sum+=val;
            }   
        }
        return sum;
    }
}