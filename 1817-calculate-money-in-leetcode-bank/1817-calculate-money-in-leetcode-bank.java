class Solution {
    public int totalMoney(int n) {
        int sum=0,count=0,j=1;
        for(int i=0;i<n;i++){
            sum+=count+j;
            count++;
            if(count==7){
                count=0;
                j++;
            }
        }
        return sum;
    }
}