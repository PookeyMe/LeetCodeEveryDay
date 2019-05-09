package Problem_41;

import java.util.Arrays;

public class answer1 {
    public static void main(String[] args)
    {

    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int target = 1;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] <= 0) {
                continue;
            }
            if(nums[i] > target) {
                return target;
            }
            if(nums[i] == target) {
                target += 1;
                continue;
            }
        }
        return target;

    }
}
