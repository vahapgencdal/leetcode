package easy.palindrome_number;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;

public class Solution {

    private static Logger LOGGER = Logger.getLogger(Solution.class.getName());
    boolean isPalindrome(int x) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
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

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean isPalindrome= solution.isPalindrome(1255521);

        LOGGER.info(String.valueOf(isPalindrome));
    }
}