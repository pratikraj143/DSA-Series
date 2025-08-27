class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        int i = n - 1;
        while (i >= 0) {
            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;

            int j = i;
            // Find start of the word
            while (i >= 0 && s.charAt(i) != ' ') i--;
            
            // Append the word
            sb.append(s.substring(i + 1, j + 1)).append(" ");
        }

        // Remove last extra space
        return sb.toString().trim();
    }
}
