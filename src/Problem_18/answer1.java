package Problem_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class answer1 {
    public static void main(String[] ages)
    {
        int[] nums=new int[]{0,0,0,0};
        List<List<Integer>> lists=fourSum(nums,0);
        for(List<Integer> list:lists)
            System.out.println(list);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len=nums.length;
        int start,end,sumtwo,tempSum;
        HashSet<List<Integer>> lists=new HashSet<>();
        for(int i=0;i<len-3;i++)
        {
            for(int j=i+1;j<len-2;j++)
            {
                sumtwo=nums[i]+nums[j];
                start=j+1;
                end=len-1;
                while(start<end)
                {
                    tempSum=nums[start]+nums[end]+sumtwo;
                    if(tempSum==target)
                    {
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        lists.add(list);
                        start++;
                        end--;
                    }
                    else if(tempSum>target)
                        end--;
                    else
                        start++;
                }
            }
        }
        List<List<Integer>> newLists=new ArrayList<>();
        newLists.addAll(lists);
        return newLists;
    }

}
