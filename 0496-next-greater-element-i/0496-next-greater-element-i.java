class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int[]  ans =new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
           }

           if(!st.isEmpty()){
                hm.put(nums2[i],st.peek());
            }else{
                hm.put(nums2[i],-1);
            }
            st.push(nums2[i]);
        }
        for(int j=0;j<nums1.length;j++){
            ans[j] = hm.get(nums1[j]);
        }
        return ans;
    }
}