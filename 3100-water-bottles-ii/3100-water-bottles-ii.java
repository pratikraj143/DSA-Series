class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum=numBottles;
       for (int empty = numBottles; empty >= numExchange; numExchange++) {
            sum++;
            empty -= numExchange - 1;
        }
        return sum;
    }
}