class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int result = -1;

        // Check for lucky integers
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                result = key;
            }
        }
        return result;
    }
}