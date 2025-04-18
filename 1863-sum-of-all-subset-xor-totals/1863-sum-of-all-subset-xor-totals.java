class Solution {
    public int subsetXORSum(int[] nums) {
       int xorSum = 0;
        for (int num : nums) {
            xorSum |= num;  // Computes OR of all elements
        }
        return xorSum * (1 << (nums.length - 1)); 
    }
}