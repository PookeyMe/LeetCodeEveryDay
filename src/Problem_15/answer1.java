package Problem_15;

import java.util.*;


public class answer1 {
    public static void main(String[] args)
    {
        int[] que=new int[]{0,0,0};
        List<List<Integer>> lists=threeSum(que);
        for(List<Integer> list:lists)
        {
            for(int i:list)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> resList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[i] + nums[end];
                if (sum == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[start]);
                    list.add(nums[i]);
                    list.add(nums[end]);
                    resList.add(list);
                    start++;
                    end--;
                    //除去end指针的重复值
                    while (nums[end] == nums[end + 1] && start < end) {
                        end--;
                    }
                    //除去start指针的重复值
                    while (nums[start] == nums[start - 1] && start < end) {
                        start++;
                    }
                } else if (sum > 0) {//3值的和大于0时，重新检测end指针是否重复后降值
                    end--;
                    while (nums[end] == nums[end + 1] && start < end) {
                        end--;
                    }
                } else {//3值的和小于0时，重新检测start指针是否重复后升值
                    start++;
                    while (nums[start] == nums[start - 1] && start < end) {
                        start++;
                    }
                }
            }
            i++;
            while (nums[i] == nums[i - 1] && i < nums.length - 2) {
                i++;
            }
        }
        return resList;
    }
}
