package Problem_16;

import java.util.Arrays;

public class answer1 {
    public static void main(String[] args)
    {
        int[] que=new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest(que,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len=nums.length,start,end;
        int minDis=Integer.MAX_VALUE,tempSum,tempDis;
        int result=nums[0]+nums[1]+nums[len-1];
        for(int i=0;i<len-2;i++)
        {
            start=i+1;
            end=len-1;
            while(start<end) {
                tempSum = nums[i] + nums[start] + nums[end];
                tempDis = Math.abs(tempSum - target);
                if (tempDis == 0) {
                    return tempSum;
                }
                if(tempDis<minDis)
                {
                    result=tempSum;
                    minDis=tempDis;
                }
                if(tempSum<target)
                    start++;
                else
                    end--;
                while(start<end-1&&nums[start+1]==nums[start])
                    start++;
                while(start<end-1&&nums[end-1]==nums[end])
                    end--;
            }
        }
        return result;
    }
}
