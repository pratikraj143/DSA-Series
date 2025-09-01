class Solution {
    public int maxDepth(String s) {
        int count=0,temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                temp++;
                count=Math.max(count,temp);
            }
            if(s.charAt(i)==')'){
                temp--;
            }
        }
        return count;
    }
}