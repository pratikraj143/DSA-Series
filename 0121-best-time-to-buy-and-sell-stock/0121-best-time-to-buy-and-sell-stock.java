class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],profit=0;
        for(int i=0;i<prices.length;i++){
            profit = profit>prices[i] - min ? profit : prices[i] - min;
            min =(min<prices[i]) ? min :prices[i]; 
        }
        return profit;
    }
}