package Problem_283;

import java.util.Arrays;

public class answer1 {
    public static void main(String[] args)
    {
        int[] ints=new int[]{0,1,0,3,12};
        moveZeroes(ints);
        for(int i:ints)
        {
            System.out.println(i);
        }
    }
    public static void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                int j=i;
                while(nums[j]==0&&j<nums.length-1)
                    j++;
                nums[i]=nums[j];
                nums[j]=0;
            }
        }
    }
}
