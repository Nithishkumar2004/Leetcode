class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int length = s.length();

        for (int i = 0; i < length-1; i++) {
            int currentVal = getValue(s.charAt(i));

            if (currentVal < getValue(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;  
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("III"));     // Output: 3
        System.out.println(sol.romanToInt("IV"));      // Output: 4
        System.out.println(sol.romanToInt("IX"));      // Output: 9
        System.out.println(sol.romanToInt("LVIII"));   // Output: 58
        System.out.println(sol.romanToInt("MCMXCIV")); // Output: 1994
    }
}
