class Solution {
    public int[] maxSubsequence(int[] arr, int k) {
        int n = arr.length;
        if(k==n) 
        return arr;
        PriorityQueue<int[]> minHeap1 = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        for(int i=0; i<n; i++){
            minHeap1.add(new int[]{i, arr[i]});
        }

        PriorityQueue<int[]> minHeap2 = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for(int i=0; i<k; i++){
            int t[] = minHeap1.poll();
            minHeap2.add(new int[]{t[1], t[0]});

        }
        int ans[] = new int[k];
        int idx = 0;
        while(!minHeap2.isEmpty()) {
            int t[] = minHeap2.poll();
            ans[idx++] = t[0];
        }
        return ans;
    }
}