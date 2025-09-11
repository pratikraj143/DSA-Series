class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder t = new StringBuilder(s);
        int j=0;

        for(int i=0;i<s.length();i++){
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                list.add(s.charAt(i));
            } 
        }
        Collections.sort(list);
   
        for(int i=0;i<s.length();i++){
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                t.setCharAt(i, list.get(j));
                j++;
            } 
        }
        return t.toString();
    }
}