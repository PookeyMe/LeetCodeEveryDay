package Problem_1;


import java.util.HashMap;
import java.util.Map;

public class answer1 {
    public static void main(String[] args)
    {
        int target=9;
        int[] nums=new int[4];
        nums[0]=2;
        nums[1]=7;
        nums[2]=11;
        nums[3]=15;
        int[] result=twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
