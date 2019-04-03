package Problem_740;

import java.util.Arrays;
import java.util.HashMap;

public class answer1 {
    public static void main(String[] args)
    {

    }
        public static int deleteAndEarn(int[] nums) {
            int max = 0;
            for (int num1 : nums) {
                if (max < num1) {
                    max = num1;
                }
            }
            int[] values = new int[max + 1];
            for (int num : nums) {
                values[num] += num;
            }
            return getMaxRob(values);
        }

        private static int getMaxRob(int[] nums) {
            if (nums.length == 0) {
                return 0;
            } else if (nums.length == 1) {
                return nums[0];
            } else if (nums.length == 2) {
                return Math.max(nums[0], nums[1]);
            }
            int[] maxRob = new int[nums.length];
            int[] maxValue = new int[nums.length];
            maxRob[0] = nums[0];
            maxRob[1] = nums[1];
            maxValue[1] = nums[0];
            for (int i = 2; i < nums.length; i++) {
                maxRob[i] = nums[i] + maxValue[i - 1];
                maxValue[i] = Math.max(maxValue[i - 1], maxRob[i - 1]);
            }
            return Math.max(maxValue[nums.length - 1], maxRob[nums.length - 1]);
        }

}
