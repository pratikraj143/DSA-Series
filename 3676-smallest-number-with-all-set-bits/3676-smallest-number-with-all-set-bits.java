class Solution {
    public int smallestNumber(int n) {
        if(n==1){
            return 1;
        }
        int power = (int)(Math.log(n) / Math.log(2));
        int result= (int)Math.pow(2,power+1);
        if(result==n){
            result=(int)Math.pow(2,power+2)-1;
        }else{
            result--;
        }
        return result;
    }
}