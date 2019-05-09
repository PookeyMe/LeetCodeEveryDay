package Problem_611;

import java.util.Arrays;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length-1;k++)
                {
                    if((nums[i]+nums[j])>nums[k])
                        count++;
                }
            }
        }
        return count;
    }
}
