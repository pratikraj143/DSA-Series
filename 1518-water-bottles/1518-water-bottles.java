class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange){
           
            int x=numBottles%numExchange;
            numBottles/=numExchange;
            sum+=numBottles;
            numBottles=numBottles+x;
        }
        return sum;
    }
}