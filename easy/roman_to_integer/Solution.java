package easy.roman_to_integer;

import java.util.*;

public class Solution {
    private static Map<String, Integer> romanNumbers;

    static {
        romanNumbers = new HashMap<>();
        romanNumbers.put("I", 1);
        romanNumbers.put("V", 5);
        romanNumbers.put("X", 10);
        romanNumbers.put("L", 50);
        romanNumbers.put("C", 100);
        romanNumbers.put("D", 500);
        romanNumbers.put("M", 1000);
    }

    public int romanToInt(String s) {
        int finalNumber = 0;

        if (s.equals("I")){
            return 1;
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int currentCharValue  = romanNumbers.get(String.valueOf(chars[i]));
            int nextCharValue  =  (i+1 == chars.length) ? 0 : romanNumbers.get(String.valueOf(chars[i+1]));

            if (currentCharValue < nextCharValue){
                finalNumber = finalNumber + nextCharValue - currentCharValue;
                i = i+1;
            }else{
                finalNumber+=currentCharValue;
            }
        }
        return finalNumber;
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