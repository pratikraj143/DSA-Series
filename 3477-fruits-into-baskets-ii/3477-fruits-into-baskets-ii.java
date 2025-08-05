class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int placed=0;
        int n=fruits.length;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(fruits[i]<= baskets[j]){
                    placed++;
                    baskets[j]=0;
                    break;
                }
            }
        }
        return n-placed;
    }
}