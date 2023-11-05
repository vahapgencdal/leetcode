package easy.two_sum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Logger;

public class Solution {

    private static Logger LOGGER = Logger.getLogger(Solution.class.getName());
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] targetArray = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        LOGGER.info(Arrays.toString(targetArray));
    }
}