package easy.roman_to_integer;

public class Solution {
    public int romanToInt(String s) {
        int finalNumber = 0;

        if (s.equals("I")){
            return 1;
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int currentCharValue  = getRomanValue(chars[i]);
            int nextCharValue  =  (i+1 == chars.length) ? 0 : getRomanValue(chars[i+1]);

            if (currentCharValue < nextCharValue){
                finalNumber += nextCharValue - currentCharValue;
                i++;
            }else{
                finalNumber+=currentCharValue;
            }
        }
        return finalNumber;
    }

    private int getRomanValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
        System.out.println(solution.romanToInt("XC"));
        System.out.println(solution.romanToInt("XL"));

    }
}