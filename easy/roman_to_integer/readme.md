# Roman to Integer
Roman numerals are represented by seven different symbols: **I**, **V**, **X**, **L**, **C**, **D** and **M**.

| Symbol     |Value |              
|:-----------|:----:|
| I          |  1   | 
| V          |  5   | 
| X          |  10  | 
| L          |  50  |
| C          | 100  | 
| D          | 500  |
| M          | 1000 |

For example, **2** is written as **II** in Roman numeral, just two ones added together. **12** is written as **XII**, which is simply **X + II**. The number **27** is written as **XXVII**, which is **XX + V + II**.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. 
There are six instances where subtraction is used:

1. I can be placed before V (5) and X (10) to make 4 and 9.
2. X can be placed before L (50) and C (100) to make 40 and 90.
3. C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

## Examples
1. Example 1:  
   Input: s = "III"
   Output: 3
   Explanation: III = 3.
2. Example 2:  
   Input: s = "LVIII"
   Output: 58
   Explanation: L = 50, V= 5, III = 3.
3. Example 3:  
   Input: s = "MCMXCIV"
   Output: 1994
   Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

## Constraints:

1. 1 <= s.length <= 15
2. s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
3. It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 
## Solution O(n)
```
class Solution {
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
                finalNumber = finalNumber + nextCharValue - currentCharValue;
                i = i+1;
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
}
```
