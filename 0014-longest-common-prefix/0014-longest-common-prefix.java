class Solution {
    public String longestCommonPrefix(String[] strs) {
         int f = 0, min = strs[0].length();

        while (f < strs.length - 1) {
            int t = 0;
            while (t < strs[f].length() && t < strs[f + 1].length() &&
                   strs[f].charAt(t) == strs[f + 1].charAt(t)) {
                t++;
            }
            min = Math.min(min, t);
            f++;
        }
        return strs[0].substring(0, min);
    }
}