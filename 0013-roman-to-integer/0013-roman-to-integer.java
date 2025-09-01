class Solution {
    public int romanToInt(String s) {
        int answer = 0, val = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> val = 1000;
                case 'D' -> val = 500;
                case 'C' -> val = 100;
                case 'L' -> val = 50;
                case 'X' -> val = 10;
                case 'V' -> val = 5;
                case 'I' -> val = 1;
            }
            if (val < prev) {
                answer -= val;
            } else {
                answer += val;
            }
            prev = val;
        }
        return answer;
    }
}