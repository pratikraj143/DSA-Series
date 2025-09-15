class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> hm = new HashSet<>();
        int count=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            hm.add(ch);
            if((ch == ' ')|| i==text.length()-1){
                for(int j=0;j<brokenLetters.length();j++){
                    if(hm.contains(brokenLetters.charAt(j))){
                        count--;
                        break;
                    };
                }
                count++;
                hm.clear();
            }
        }
        return count;
    }
}