class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int r=1;
       for (int i = 0; i < n / 2; i++) {
            arr[i] = r;
            arr[n - 1 - i] = -r;
            r++;
        }

        return arr;
    }
}