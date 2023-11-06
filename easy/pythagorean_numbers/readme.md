# Two Sum
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
 
## Solution O(n2)
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}
```
12321
123321