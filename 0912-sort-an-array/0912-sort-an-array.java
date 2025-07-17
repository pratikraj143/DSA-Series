class Solution {
    private static void mergeSort(int[] nums,int low,int high){
        if(low>=high){
            return ;
        }
        int mid= (low + high)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);

        merge(nums,low,mid,high);
    }
    private static void merge(int[] nums,int low,int mid,int high){
        int[] arr= new int[high - low + 1];
        int left=low,i=0;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<nums[right]){
                arr[i++]=nums[left];
                left++;
            }else{
                arr[i++]=nums[right];
                right++;
            }
        }
        while(left<=mid){
            arr[i++]=nums[left];
            left++;
        }
        while(right<=high){
            arr[i++]=nums[right];
            right++;
        }
        for (int j = 0; j < arr.length; j++) {
            nums[low + j] = arr[j];
        }

    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}