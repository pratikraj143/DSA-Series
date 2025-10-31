class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int arr[]= new int[2];
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                arr[j++]=nums[i];
                if(j==2){
                    break;
                }
            }
        }
        return arr;
    }
}