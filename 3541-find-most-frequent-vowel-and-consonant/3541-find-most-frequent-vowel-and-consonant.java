class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> cons = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if("aeiou".indexOf(ch) != -1){
                vowel.put(ch,vowel.getOrDefault(ch, 0) + 1);
            }else{
                cons.put(ch,cons.getOrDefault(ch, 0) + 1);
            }
        }
        int maxVowel = vowel.isEmpty() 
                        ? 0 
                        : Collections.max(vowel.values());

        int maxcons = cons.isEmpty() 
                        ? 0 
                        : Collections.max(cons.values());
        
        return  maxVowel + maxcons;
    }
}