class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder ();
        int i=-1;
        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            if(c>='a' && c<='z'){
                i++;
                str.append(c);
            }else{
                if(i>=0)
                {
                    str.deleteCharAt(i);
                    i--;
                }
            }
        }
        return str.toString();
    }
}