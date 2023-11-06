# Palindrome Numbers
Given an integer **x**, return **true** if **x** is a **palindrome** , and **false** otherwise.

## Examples
1. Example 1:  
   Input: x = 121
   Output: true
   Explanation: 121 reads as 121 from left to right and from right to left.
2. Example 2:  
   Input: x = -121
   Output: false
   Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
3. Example 3:  
   Input: x = 10
   Output: false
   Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

## Constraints:
-231 <= x <= 231 - 1
 
## Solution O(n)
```
class Solution {
    public boolean isPalindrome(int x) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        if(x>=0 && x-x%10==0)
            return true;

        while (x>0){
            int remain = x%10;
            x=(x-remain)/10;
            numbers.add(remain);
        }
        if (numbers.size()<2)
            return false;

        for(int i = 0; i< numbers.size()/2; i++){
            if(!Objects.equals(numbers.get(i), numbers.get(numbers.size() - i-1))){
                return false;
            }
        }
        return true;
    }
}
```