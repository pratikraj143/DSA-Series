class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        int result = -1;
        
        // Check for lucky integers
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                result = Math.max(result, key);
            }
        }
        return result;
    }
}