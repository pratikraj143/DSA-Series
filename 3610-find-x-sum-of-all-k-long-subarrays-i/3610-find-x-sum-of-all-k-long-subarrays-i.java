class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0,r=k;
        int[] arr=new int[nums.length-k+1];
        int j=0;
        while(r<=nums.length){
           for(int i=l;i<r;i++){
                int  count = hm.getOrDefault(nums[i], 0);
                hm.put(nums[i],count+1);
            } 
            List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(hm.entrySet());

            sortedList.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // higher frequency first
            } else {
                return b.getKey() - a.getKey(); // if same freq, higher value first
            }
            });
            int sum=0;
            for(int i=0;i< x && i < sortedList.size();i++){
                int key = sortedList.get(i).getKey();
                int value = sortedList.get(i).getValue();
                sum+= key * value;
            }
            arr[j++]=sum;
            l++;
            r++;
            hm.clear();
        }
        return arr;
    }
}